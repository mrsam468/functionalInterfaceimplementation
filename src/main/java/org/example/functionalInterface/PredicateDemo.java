package org.example.functionalInterface;

import java.util.function.Predicate;

class Predicates implements Predicate<Integer> {

    @Override
    public boolean test(Integer integer) {
        return integer % 2 == 0;
    }
}

public class PredicateDemo {
    public static void main(String[] args) {
        Predicates predicates = new Predicates();
        System.out.println(predicates.test(8));
//        IMPLEMENTATION OF Supplier FUNCTION USING LAMBDA EXPRESSION
        Predicate<Integer> lambdaPredicate = (num) -> num % 2 == 0;
        System.out.println(lambdaPredicate.test(3));

    }
}
