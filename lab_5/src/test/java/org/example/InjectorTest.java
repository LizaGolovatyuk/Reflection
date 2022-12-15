package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class InjectorTest {
    String first, second;

    @BeforeEach
    void setValue()
    {
        first="Interface: 1, Realisation: 2";
        second="Interface: 2, Realisation: 1";
    }

    @Test
    void InjectTest()
    {
        MyClass myClass = new MyClass();
        Injector injector = new Injector();
        injector.inject(myClass);
        assertEquals(first, myClass.myFuncForFirst());
        assertEquals(second, myClass.myFuncForSecond());
    }

}