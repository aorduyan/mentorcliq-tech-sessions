package com.patterns.pattern.singleton.impl;

import static java.lang.System.out;

public class SingletonClassic {

    private static SingletonClassic instance;

    private SingletonClassic() {
        out.println("inside SingletonClassic constructor");
    }

    public static SingletonClassic getInstance() {
        out.println("inside SingletonClassic.getInstance");

        if (instance == null) {
            instance = new SingletonClassic();
        }
        return instance;
    }

    public static void otherMethod() {
        out.println("inside SingletonClassic.otherMethod");
    }

}
