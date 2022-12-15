package org.example;

/**
 * Класс InterfaceSecondRealisationFirst - первая реализация интерфесного класса InterfaceSecond
 */
public class InterfaceSecondRealisationFirst implements InterfaceSecond{

  /**
   * Метод doSomethingInterfaceSecond выдает информацию о порядковом номере интерфейса и о порядковом номере его реализации
   * @return строку
   */
  public String doSomethingInterfaceSecond(){
    String s="Interface: 2, Realisation: 1";
    return s;
  }
}
