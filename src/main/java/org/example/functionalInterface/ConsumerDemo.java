package org.example.functionalInterface;

import java.util.function.Consumer;

class Consumers implements Consumer<String> {

    @Override
    public void accept(String name) {
        System.out.println("his name is " + name);
    }
}

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> consumer = new Consumers();
        consumer.accept("david");
//        IMPLEMENTATION OF CONSUMER FUNCTION USING LAMBDA EXPRESSION
        Consumer<String> lambdaConsumer = (msg) -> System.out.println("my name is " + msg);
        lambdaConsumer.accept("james");
    }
}
