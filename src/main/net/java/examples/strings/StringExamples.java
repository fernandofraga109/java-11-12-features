package main.net.java.examples.strings;

import java.util.stream.Collectors;

public class StringExamples {

    public static void main(String args[]) {


        //isBlank(): This is a boolean method. It just returns true when a string is empty and vice-versa.
        String str1 = "";
        System.out.println(str1.isBlank());
        String str2 = "Test";
        System.out.println(str2.isBlank());

       //lines(): This method is to return a collection of strings which are divided by line terminators.
        String str = "Hello\nJava\n11";
        System.out.println(str
                .lines()
                .collect(Collectors.toList()));

        //repeat(n): Result is the concatenated string of original string repeated the number of times in the argument.
        String rep = "ok ";
        System.out.println(rep.repeat(4));


        //stripLeading(): It is used to remove the white-space which is in-front of the string
        String stripL = " Testing";
        System.out.println(stripL.stripLeading());

        String strT = "Testing2 ";
        System.out.println(strT.stripTrailing());

        String strip = " Testing3 ";
        System.out.println(strip.strip());

    }


}
