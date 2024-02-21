package com.bridgelabz.dailyprograms;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String x = "silent";
        String y = "listen";
        char[] a =x.toCharArray();
        char[] b =y.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        Boolean result = Arrays.equals(a,b);
        if(result==true){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }
    }
}
