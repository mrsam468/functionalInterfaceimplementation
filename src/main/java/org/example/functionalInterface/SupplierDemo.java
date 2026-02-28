package org.example.functionalInterface;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.function.Supplier;

class Suppliers implements Supplier<LocalDateTime> {

    @Override
    public LocalDateTime get() {
        return LocalDateTime.now();
    }
}

public class SupplierDemo {

    public static void main(String[] args) {
        Supplier<LocalDateTime> supplier = new Suppliers();
        System.out.println(supplier.get());
//      IMPLEMENTATION OF Supplier FUNCTION USING LAMBDA EXPRESSION
        Supplier<LocalDateTime> lambdaSupplier = () -> LocalDateTime.now();
        System.out.println(lambdaSupplier.get());
    }
}
