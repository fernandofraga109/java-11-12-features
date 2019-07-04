package main.net.java.examples.vars;


import java.io.*;
import java.net.Socket;
import java.util.*;

public class VarExample {

    public static void main(String[] args) {

        //String str = "Java 10"; // infers String
        var str = "Java 10"; // infers String

        //List<String> list = new ArrayList<>();
        var list = new ArrayList<String>();

        //Stream<String> stream = list.stream();
        var stream = list.stream();

        //List<String> newList = List.of("Hello word", "New Features");
        var newList = List.of("Hello word", "New Features");

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        //var bos = new ByteArrayOutputStream();
        var inputMis = new InputMismatchException();


        // var in for loops
        var letters = List.of("a", "b", "c");
        for (var letter : letters) {
            System.out.print(letter + " ");
        }

        // var in try-with-resources
        try (var file = new FileInputStream(new File("no-such-file"))) {
            new BufferedReader(new InputStreamReader(file))
                    .lines()
                    .forEach(System.out::println);
        } catch (IOException ex) {
            // at least, we tried
            System.out.println("There's actually no no-such-file.");
        }

        //take care...
        var orderProcessor = createInternationalOrderProcessor(1L, 2L);

    }

    //nops
    /*
    private var getFoo() {
        return "foo";
    }
    */

    public static List<String> createInternationalOrderProcessor(Long order, Long contract) {
        return new ArrayList<>();
    }
}
