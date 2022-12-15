package org.example;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        Injector injector = new Injector();
        injector.inject(myClass);
        System.out.println(myClass.myFuncForFirst());
        System.out.println(myClass.myFuncForSecond());
    }
}