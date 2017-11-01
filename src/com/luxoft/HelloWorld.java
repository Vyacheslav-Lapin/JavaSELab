package com.luxoft;

import com.luxoft.presentation.MessagePrinter;

public class HelloWorld {
    public static void main(String[] strings) {
        MessagePrinter messagePrinter = new MessagePrinter();
        System.out.println(messagePrinter.sayHello());

        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int anInt : ints)
            System.out.println("ints[i] = " + anInt);
    }
}