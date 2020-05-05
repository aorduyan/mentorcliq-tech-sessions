package com.patterns.pattern.singleton;

import com.patterns.pattern.singleton.impl.Nton;
import com.patterns.pattern.singleton.impl.SingletonClassic;
import com.patterns.run.PatternRunner;

import java.util.stream.Stream;

import static java.lang.System.out;

public class SingletonRunner implements PatternRunner {

    @Override
    public void run() {
        test();
//        nTonTest();
    }

    private static void test() {
        out.println("accessing class");
        Class<SingletonClassic> clazz = SingletonClassic.class;
        out.println("accessed class");
        out.println();

        out.println("accessing class other method");
        SingletonClassic.otherMethod();
        out.println("accessed class other method");
        out.println();

        out.println("request singleton instance1");
        SingletonClassic inst1 = SingletonClassic.getInstance();
        out.println("requested singleton instance1");
        out.println();

        out.println("request singleton instance2");
        SingletonClassic inst2 = SingletonClassic.getInstance();
        out.println("requested singleton instance2");
        out.println();

        out.println("instance 1 = " + inst1);
        out.println("instance 2 = " + inst2);
    }

    private static void nTonTest() {
        Stream.generate(Nton::getInstance)
                .limit(20)
                .forEach(instance -> out.println("Nton " + instance.getInstanceNum()));

    }

}
