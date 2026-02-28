package org.example.functionalInterface;

import java.util.function.Function;

class Functions implements Function<String, Integer> {

    @Override
    public Integer apply(String s) {
        return s.length();
    }
}

public class FunctionDemo {
    public static void main(String[] args) {
        Function<String, Integer> function = new Functions();
        System.out.println(function.apply("samuel"));
//        IMPLEMENTATION OF  FUNCTION USING LAMBDA EXPRESSION
        Function<String, Integer> lambdaFunction = (msg) -> msg.length();
        System.out.println(lambdaFunction.apply("samuel"));
    }
}
