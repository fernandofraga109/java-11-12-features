package main.net.java.examples.files;

import java.nio.file.Files;
import java.nio.file.Path;

public class FileMethods {

    public static void main(String args[]) throws Exception {

        Files.writeString(Path.of("example.txt"), "Hey guys!");

        System.out.println(Files.readString(Path.of("example.txt")));


        Files.writeString(Path.of("example2.txt"), "Hey guys!");
        Files.writeString(Path.of("example3.txt"), "Hey everyone!");

        System.out.println(Files.isSameFile(Path.of("example2.txt"), Path.of("example3.txt")));
    }
}
