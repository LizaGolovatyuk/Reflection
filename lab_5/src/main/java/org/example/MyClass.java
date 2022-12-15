package org.example;

/**
 * Класс MyClass содержит в себе поля типа  InterfaceFirst и InterfaceSecond, и может совершать с данными полями конкретные действия
 */
public class MyClass {

    @AutoInjectable
    InterfaceFirst first;

    @AutoInjectable
    InterfaceSecond second;

    /**
     * Метод myFuncForFirst выаолняет метод doSomethingInterfaceFirst для поля first
     * @return строку
     */
    public String myFuncForFirst(){
       return first.doSomethingInterfaceFirst();
    }

    /**
     *  Метод myFuncForSecond выаолняет метод doSomethingInterfaceSecond для поля second
     * @return строку
     */
    public String myFuncForSecond() {
        return second.doSomethingInterfaceSecond();
    }

}
