import java.util.Scanner;
import java.io.IOException;

public class PhoneBook {
  public static void main(String[] args) throws InterruptedException, IOException {
    PhoneBookData phoneBookData = new PhoneBookData();
    
    Scanner scan = new Scanner(System.in);
    int number;
    while (true) {
      System.out.println("\n1. Добавить запись\n2. Найти запись\n3. Вывести отсортированный список\n0. Выход\n");
    //   Scanner scan = new Scanner(System.in);
      System.out.print("Выберите пункт меню: ");
      try{
            number = Integer.parseInt(scan.next());
            // int number = scan.nextInt();
            scan.nextLine();

            if (number == 0){
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                break;

            } else if (number == 1) {
                System.out.print("Введите имя: ");
                String name = scan.nextLine();
                name = name.toUpperCase();
                System.out.print("Введите номер: ");
                Long phoneNum = scan.nextLong();
                phoneBookData.addRes(name, phoneNum);

            } else if (number == 2) {
                System.out.print("Введите имя для поиска номера(ов): ");
                String name = scan.nextLine();
                name = name.toUpperCase();
                System.out.println(phoneBookData.find(name));
        
            } else if (number == 3)
                phoneBookData.showPhoneBook();
            else
                System.out.print("Пункт меню не найден. Попробуйте еще раз.\n");
      } catch (NumberFormatException e) {
        System.out.println("Неверный ввод! Необходимо ввести цифры 1, 2, 3 или 0");
    }        
          
    }
  }
}