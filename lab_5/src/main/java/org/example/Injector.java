package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Properties;

/**
 * Класс Injector сопоставляет интерфейс с его руализацией  с помощью зависимостей из properties
 */
public class Injector {

    /**
     * Метод inject инициализирует интерфейсные поля object конкретными реализациями
     * @param object
     * @return объект
     * @param <T>
     */
    public <T> T inject(T object) {
        File f = new File("MyProperties.properties");
        Properties p = new Properties();
        try {
            p.load(new FileReader(f));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Field[] publicF = object.getClass().getDeclaredFields();
        for (Field i : publicF) {
            if (i.isAnnotationPresent(AutoInjectable.class) && i.getType() == InterfaceFirst.class) {
                try {
                    i.set(object, getObject(p, "InterfaceFirst"));
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
            if (i.isAnnotationPresent(AutoInjectable.class) && i.getType() == InterfaceSecond.class) {
                try {
                    i.set(object, getObject(p, "InterfaceSecond"));
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return object;
    }

    /**
     * Метод getObject производит инициализацию произвольного объекта
     * @param p
     * @param s
     * @return объект
     */
    private Object getObject(Properties p, String s) {
        try {
            Object object = null;
            Class<?> c = Class.forName(p.getProperty(s));
            object = c.newInstance();
            return object;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

}
