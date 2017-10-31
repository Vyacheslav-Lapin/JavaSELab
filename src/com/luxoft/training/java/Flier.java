package com.luxoft.training.java;

public interface Flier {
    void fly();

    default void _takeOff() {
        System.out.println("Взлетаем!");
    }

    void scream(); // sout

    default void fullScream() {
        System.out.println("Khe-khe!");
        scream();
    }
}
