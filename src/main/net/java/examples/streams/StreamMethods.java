package main.net.java.examples.streams;

import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamMethods {

        public static void main(String[] args) {

            var programmingLanguages = List.of("java", "c++", "php", "python", "scala");

            //TAKE WHILE
            programmingLanguages.stream()
                    .filter(Objects::nonNull)
                    .takeWhile(s -> s.length() < 5)
                    .forEach(System.out::println);

            System.out.println();

            //DROP WHILE
            programmingLanguages.stream()
                    .filter(Objects::nonNull)
                    .dropWhile(s -> s.length() < 5)
                    .forEach(System.out::println);


            //Predicate.not
            programmingLanguages.stream()
                    .filter(s -> !s.isEmpty())
                    .collect(Collectors.toList());

            programmingLanguages.stream()
                    .filter(Predicate.not(String::isEmpty))
                    .collect(Collectors.toList());

        }
}
