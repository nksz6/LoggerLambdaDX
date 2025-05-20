package com.nk.java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileOutputStream;
import java.io.IOException;

public class LambdaExamples2 {

    private static final Logger logger = LoggerFactory.getLogger(LambdaExamples2.class); //static logger instance



    public static void main(String[] args) throws IOException {

        //Java Lambda expression can implement interfaces with
        // a single unimplemented method (abstract) method,
        //but as many default of static methods as you like.
        //otherwise called functional interfaces.


        //lambda
        MyInterface MyInterface = (String text) -> logger.info(text);

        MyInterface.printIt("hello world");

        MyInterface.printUtf8To("hello file", new FileOutputStream("data.txt"));

        com.nk.java.MyInterface.printItToSystemOut("hello system out");

    }
}
