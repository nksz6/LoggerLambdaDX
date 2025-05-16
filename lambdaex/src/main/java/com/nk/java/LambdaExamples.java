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
            (String o1, String o2) -> { return o1.compareTo(o2);
        };

        int comparison2 = stringComparatorLambda.compare("hello", "world");
        logger.info("comparison 2 (lambda) result: {}", comparison2);

    }
}
