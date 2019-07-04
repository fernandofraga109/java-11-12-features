package main.net.java.examples.collections;

import java.util.*;
import java.util.stream.Collectors;

public class FactoryMethods {

    public static void main(String[] args) {

        // Object
        List immutableList = List.of();

        Collection<String> imuList = Collections.unmodifiableCollection(Arrays.asList("java", "php", "python", "c++"));

        var unmodifiableList = List.of("java", "php", "python", "c++");

        // Set<String>
        Set<String> immutableSet = Set.of();

        // Set<String>
        Set<String> bar = Set.of("cat", "dog", "rat", "frog");


        // Map.Entry
        var immutableMapEntry = Map.entry("testing", "emmmm");

        //  Map，Key Value
        var mapValueOf = Map.of(1, "java", 2, "php", 3, "c++");


        // Entries  Map
        /*Map<Integer, String> emptyEntryMap = new HashMap<Integer, String>();
        emptyEntryMap.put( 20, "twenty");
        emptyEntryMap.put( 30, "thirty");
        emptyEntryMap.put( 40, "forty");
*/
        var emptyEntryMap = Map.ofEntries(
                Map.entry(20, "twenty"),
                Map.entry(30, "thirty"),
                Map.entry(40, "forty")
        );

    }
}
