package org.example;

public class Reversed {

    public static String reverse(String input) {
        var reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }
}
