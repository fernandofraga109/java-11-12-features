package main.net.java.examples.vars;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Example {

    public static void main(String[] args) {


        //String str = "Java 10"; // infers String
        var str = "Java 10"; // infers String

        //List<String> list   = new ArrayList<>();
        var list = new ArrayList<String>();

        //Stream<String> stream = list.stream();
        var stream = list.stream();

        //List<String> newList = List.of("Hello word", "New Features");
        var newList = List.of("Hello word", "New Features");

        //ByteArrayOutputStream bos = new ByteArrayOutputStream();
        var bos = new ByteArrayOutputStream();


        // var in for loops
        var numbers = List.of("a", "b", "c");
        for (var nr : numbers)
            System.out.print(nr + " ");

        // var in try-with-resources
        try (var file = new FileInputStream(new File("no-such-file"))) {
            new BufferedReader(new InputStreamReader(file))
                    .lines()
                    .forEach(System.out::println);
        } catch (IOException ex) {
            // at least, we tried
            System.out.println("There's actually no no-such-file.");
        }

        //good usages
        //InternationalCustomerOrderProcessor<AnonymousCustomer, SimpleOrder<Book>> orderProcessor = createInternationalOrderProcessor(customer, order);
        //var orderProcessor = createInternationalOrderProcessor(customer, order);


    }

    /* nope
    private var getFoo() {
        return "foo";
    }
    */
}
