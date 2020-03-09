package com.epam.Design_Pattern_Singleton;

public class LazySingleton {

    private static volatile LazySingleton instance= null;

    private LazySingleton() {}

    public synchronized static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }

        return instance;
    }
}