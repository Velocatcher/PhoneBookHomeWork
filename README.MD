# **Задание**

> Реализуйте структуру телефонной книги с помощью HashMap.
  Программа также должна учитывать, что в во входной структуре будут повторяющиеся имена
  с разными телефонами, их необходимо считать, как одного человека с разными телефонами. 
  Вывод должен быть отсортирован по убыванию числа телефонов.

1. class PhoneBookData

    * public void addRes(String name, Long phoneNum) - добавление данных в телефонную книгу.
        Для номера телефона выбрал Long чтобы помещался 11-значный номер.
        Переменную name перевожу сразу в UpperCase, чтобы потом при поиске вводить имена в любом регистре.
        Если такое имя есть добавляется дополнительный номер, если нет добавляется новая запись.

    * public ArrayList<Long> find(String name) - поиск номера телефона по имени абонента. 
        Имя абонента вводится в любом регистре, если абонент отсутствует - выводится сообщение
        "У данного абонента нет телефонных номеров".

    * public void showPhoneBook() - вывод всей отсортированной телефонной книги.

2. public class PhoneBook

    * В классе реализуется меню, проверяется правильность ввода пунктов меню.
        При выходе очищается терминал.

