package ru.shum;

import java.util.Scanner;

public class DataEntry {

  public String[] enterData() {
    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.println("Введите Ф.И.О, дату рождения, номер телефона, пол "
          + "через ПРОБЕЛ "
          + "(Пример: Иванов Иван Иванович 10.05.1980 79856542336 f или m: ");
      String data = sc.nextLine();
      String[] arr = data.split(" ");
      if (arr.length == 6) {
        return arr;
      } else {
        System.out.println("Вы ввели либо не все данные либо ввели лишнего");
      }
    }
  }
}
