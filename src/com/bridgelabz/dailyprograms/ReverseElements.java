package com.bridgelabz.dailyprograms;

import java.util.ArrayList;

public class ReverseElements {
    public static void main(String[] args) {
        String[] words = {"apple","jack","jill"};
        ArrayList<String> reversed = new ArrayList<>();

        for(String word : words){
            String rev="";
            for(int i=word.length()-1;i>=0;i--) {
                rev += word.charAt(i);

            }
            reversed.add(rev);
        }

        System.out.println(reversed);
    }
}
