package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("john", Gender.MALE),
                new Person("alice", Gender.FEMALE),
                new Person("david", Gender.MALE),
                new Person("jessica", Gender.FEMALE)
        );
//        USING IMPERATIVE APPROACH
        System.out.println("USING IMPERATIVE APPROACH");
        List<Person> females = new ArrayList<>();
        for (Person person : people) {
            if (Gender.FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }
        for (Person female : females) {
            System.out.println(female);
        }

//        USING DECLARATIVE APPROACH
        System.out.println("USING DECLARATIVE APPROACH");
        people.stream()
                .filter(person -> Gender.FEMALE.equals(person.gender))
                .forEach(System.out::println);
    }

    public enum Gender {
        MALE, FEMALE
    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
}
