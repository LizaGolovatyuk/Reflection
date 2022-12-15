package org.example;

/**
 * Класс InterfaceFirstRealisationFirst - первая реализация интерфесного класса InterfaceFirst
 */
public class InterfaceFirstRealisationFirst implements InterfaceFirst{

    /**
     * Метод doSomethingInterfaceFirst выдает информацию о порядковом номере интерфейса и о порядковом номере его реализации
     * @return строку
     */
    public String doSomethingInterfaceFirst(){
        String s="Interface: 1, Realisation: 1";
        return s;
    }
}
