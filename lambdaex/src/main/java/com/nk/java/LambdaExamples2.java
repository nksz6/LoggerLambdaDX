package com.nk.java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class LambdaExamples2 {
    public static void main(String[] args) throws IOException {

        //lambda
        MyInterface MyInterface = (String text) -> {
            System.out.println(text);

        };

        MyInterface.printIt("hello world");

        MyInterface.printUtf8To("hello file", new FileOutputStream("data.txt"));

    }
}
