package ru.shum;

public class DataException extends Exception{
  public DataException(){

  }
  public void dataException(String i) {
    System.out.println("Exception: DataNotCorrectFormat");
    System.out.printf("Введён не правильный формат данных: %s", i);
    System.out.println();
  }

}
