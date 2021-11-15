package com.company;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<String> words = new Stack<String>();
        words.push("First Info");
        words.push("Second Info");
        words.push("Third info");
        words.push("Fourth info");
        Group<String > group = new Group<>(words);

        System.out.println("Stack: ");
        System.out.println(words);

        group.invertGroup(words);
    }
}
