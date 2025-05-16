package com.nk.java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Comparator;

public class LambdaExamples
{

    private static final Logger logger = LoggerFactory.getLogger(LambdaExamples.class); //static logger instance

    public static void main( String[] args )
    {

        //anonymous implementation of comparator
        Comparator<String> stringComparatorAnonymous = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        int comparison = stringComparatorAnonymous.compare("hello", "world");
        logger.info("comparison 1 (anonymous) result: {}", comparison);


        //lambda implementation of comparator
        Comparator<String> stringComparatorLambda = 
            (o1, o2) -> { return o1.compareTo(o2); //java already knows o1 and o2 are strings so the type can be omitted in the lambda implementation
        }; //brackets can also be omitted since its only doing one thing, along with 'return' statement

        int comparison2 = stringComparatorLambda.compare("hello", "world");
        logger.info("comparison 2 (lambda) result: {}", comparison2);


        //0 parameters
        MyFunction0 myFunction0 = () -> logger.info("Hello Function Body, with no parameters");
        myFunction0.application0Param();

        //1 parameter
        MyFunction1 myFunction1 = text ->  logger.info(text); //no need for parenthesis with 1 parameter
        myFunction1.application1Param("Hello Function Body, with 1 parameter");

        //2 parameters
        MyFunction2 myFunction2 = (text1, text2) -> logger.info(text1 + text2);
        myFunction2.application2Param("Hello Function Body, ", "with 2 parameters");




    }
}
