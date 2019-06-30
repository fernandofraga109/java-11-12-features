package main.net.java.examples.optionals;

import java.util.Optional;

public class Example {

    public static void main(String[] args) {


    }

    private String useOptionalPropertyOrElse(Optional<String> anOptional) {

        /*if (anOptional.isPresent()) {
            return anOptional.get();
        }
        return "";
        */
        return anOptional.orElse("");
    }

    private Optional<String> useOptionalOr(Optional<String> firstOptional, Optional<String> secondOptional) {
        /*if (firstOptional.isPresent()) {
            return firstOptional;
        } else {
            return secondOptional;
        } */
        return firstOptional.or(() -> secondOptional);
    }


    private void useOptionalProperlyWithOrElse(Optional<String> anOptional) {
        if (anOptional.isPresent()) {
            System.out.println(anOptional.get());
        } else {
            System.out.println(anOptional.get());
        }

        anOptional.ifPresentOrElse(System.out::println, () -> System.out.println("Nothing found!") );
    }

}
