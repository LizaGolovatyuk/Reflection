package org.example;

/**
 * Класс InterfaceFirstRealisationSecond - вторая реализация интерфесного класса InterfaceFirst
 */
public class InterfaceFirstRealisationSecond implements InterfaceFirst {

    /**
     * Метод doSomethingInterfaceFirst выдает информацию о порядковом номере интерфейса и о порядковом номере его реализации
     * @return строку
     */
    public String doSomethingInterfaceFirst(){
        String s="Interface: 1, Realisation: 2";
        return s;
    }
}
