package streams;


import java.util.List;
import java.util.stream.Collectors;

import static streams._Streams.Gender.FEMALE;
import static streams._Streams.Gender.MALE;

public class _Streams {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("alice", FEMALE),
                new Person("david", MALE),
                new Person("john", MALE),
                new Person("jessica", FEMALE)
        );
        people.stream()
                .map(person -> person.name)
                .mapToInt(String::length)
                .forEach(System.out::println);
        System.out.println(people.stream()
                .allMatch(person -> person.gender.equals(FEMALE)));

    }

    enum Gender {
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
