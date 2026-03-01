package javaoptionals;

import java.util.Objects;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Object value = Optional.ofNullable(null)
                .orElseGet(() -> "default value");
        Object value2 = Optional.of("happy people")
                .orElseThrow(() -> new IllegalArgumentException("exception"));
        System.out.println(value2);
        System.out.println(value);
    }
}
