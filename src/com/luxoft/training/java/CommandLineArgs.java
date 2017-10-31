package com.luxoft.training.java;

/**
 * kjhdsfgkjhdfg
 * sghsfgh
 * fghfg
 * hfghfg
 * hfg
 * @author Vyacheslav Lapin
 */
public class CommandLineArgs {

    private int x;

    {
        try {
            x = 1 / 0;
        } catch (Exception e) {
            x = 55;
        }
    }

    public static void main(String... args) {

        CommandLineArgs commandLineArgs =
                new CommandLineArgs();

        System.out.println(commandLineArgs.x);
    }
}
