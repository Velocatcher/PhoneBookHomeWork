import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import static java.util.Comparator.comparingLong;

class PhoneBookData {
  private static HashMap<String, ArrayList<Long>> phoneBook = new HashMap<>();

  
  public void addRes(String name, Long phoneNum) {
    name = name.toUpperCase();
    if (phoneBook.containsKey(name)) {
      phoneBook.get(name).add(phoneNum);
    } else {
      ArrayList<Long> phones = new ArrayList<>();
      phones.add(phoneNum);
      phoneBook.put(name, phones);
    }
  }

  
  public ArrayList<Long> find(String name) {
    name = name.toUpperCase();
    if (phoneBook.containsKey(name)) {
      return phoneBook.get(name);
    }
    System.out.print("У данного абонента нет телефонных номеров");
    return new ArrayList<Long>();
        
  }

  
  public void showPhoneBook() {
    if (!phoneBook.isEmpty()) {

      
      Map<String, ArrayList<Long>> sorted = phoneBook.entrySet().stream()
          .sorted(comparingLong(e -> -e.getValue().size()))
          .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> {
            throw new AssertionError();
          }, LinkedHashMap::new));

          for (Map.Entry<String, ArrayList<Long>> pair : sorted.entrySet()) {
            System.out.println(String.format("Имя : %s, Телефон(ы) : %s", pair.getKey(), pair.getValue()));   
          }

      
    } else
      System.out.println("Записей нет\n");
  }
}
