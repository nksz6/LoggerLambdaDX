package com.nk.java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Comparator;

public class LambdaExamples
{

    private static final Logger logger = LoggerFactory.getLogger(LambdaExamples.class); //static logger instance

    public static void main( String[] args )
    {
        //lambda implementation of comparator
        Comparator<String> stringComparatorLambda =
            (o1, o2) ->  o1.compareTo(o2); //java already knows o1 and o2 are strings so the type can be omitted in the lambda implementation
             //brackets can also be omitted since its only doing one thing, along with 'return' statement

        int comparison = stringComparatorLambda.compare("hello", "world");
        logger.info("comparison 1 (lambda) result: {}", comparison);


        //0 parameters
        MyFunction0 myFunction0 = () -> logger.info("Hello Function Body, with no parameters");
        myFunction0.application0Param();

        //1 parameter
        MyFunction1 myFunction1 = text ->  logger.info(text); //no need for parenthesis with 1 parameter
        myFunction1.application1Param("Hello Function Body, with 1 parameter");

        //2 parameters
        MyFunction2 myFunction2 = (text1, text2) -> logger.info("{} {}", text1, text2);
        myFunction2.application2Param("Hello Function Body, ", "with 2 parameters");

        //2 parameters with return type String
        MyFunction2String myFunction2String = (text1, text2) -> text1 + " + " +  text2;
        String returnValue = myFunction2String.application2ParamString("hello function body, with 2 parameters", "return type String");
        logger.info(returnValue);

        MyFunction2String myFunction2String2 = myFunction2String;
        String returnValue2 = myFunction2String2.application2ParamString("hello 2nd function body, with 2 parameters","return type String");
        logger.info(returnValue2);




    }
}
