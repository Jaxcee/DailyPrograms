package com.bridgelabz.dailyprograms;

public class Vowels {
    public static void main(String[] args) {
        String[] input = {"apple", "mango", "orange"};
        System.out.println("The words starting with vowels:");
        for (String word : input) {
            if (word.charAt(0) == 'a' || word.charAt(0) == 'e'||word.charAt(0) == 'i' || word.charAt(0) == 'o'||word.charAt(0) == 'u') {
                System.out.println(word);
            }
        }
    }
}
