package org.example;

import org.jetbrains.annotations.NotNull;

public class Main {
    public static void main( String[] args) {
        String str = "abbba";
        System.out.println(Palindrom(str) ? "True" : "False");
    }
    private static boolean Palindrom(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}