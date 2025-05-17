package com.nk.java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class LambdaExamples2 {
    public static void main(String[] args) throws IOException {

        //Java Lambda expression can implement interfaces with
        // a single unimplemented method (abstract) method,
        //but as many default of static methods as you like.
        //otherwise called functional interfaces.


        //lambda
        MyInterface MyInterface = (String text) -> {
            System.out.println(text);

        };

        MyInterface.printIt("hello world");

        MyInterface.printUtf8To("hello file", new FileOutputStream("data.txt"));

        com.nk.java.MyInterface.printItToSystemOut("hello system out");

    }
}
