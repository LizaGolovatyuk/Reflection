package org.example;

/**
 * Класс InterfaceSecondRealisationFirst - вторая реализация интерфесного класса InterfaceSecond
 */
public class InterfaceSecondRealisationSecond implements InterfaceSecond {

    /**
     * Метод doSomethingInterfaceSecond выдает информацию о порядковом номере интерфейса и о порядковом номере его реализации
     * @return строку
     */
    public String doSomethingInterfaceSecond(){
        String s="Interface: 2, Realisation: 2";
        return s;
    }
}
