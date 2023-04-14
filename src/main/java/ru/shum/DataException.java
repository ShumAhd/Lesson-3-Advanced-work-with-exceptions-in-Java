package ru.shum;

public class DataException extends Exception{
  public DataException(){

  }
  public void dataException(String i) {
    System.out.printf("Введён не правильный формат данных: %s", i);
  }

}

//public class FullNameException extends Exception {
//
//  String data;
//
//  public FullNameException(String inputData) {
//    this.data = inputData;
//  }
//
//  @Override
//  public String getMessage() {
//    return "Неправильный формат ФИО '" + data + "'.\n" +
//        "Вводите ФИО только из букв!\n";
//  }
//}