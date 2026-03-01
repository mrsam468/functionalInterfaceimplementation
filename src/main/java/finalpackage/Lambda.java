package finalpackage;

import java.util.function.Function;

public class Lambda {
    public static void main(String[] args) {
        Function<String, String> uppercaseName = name -> name.toUpperCase();
        System.out.println(uppercaseName.apply("james"));
    }
}
