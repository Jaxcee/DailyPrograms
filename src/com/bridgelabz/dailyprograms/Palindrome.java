package com.bridgelabz.dailyprograms;

public class Palindrome {
    public static void main(String[] args) {
        String name = "racecar";
        String rev ="";
        for(int i =0;i<name.length();i++){
            rev=name.charAt(i)+rev;

        }
        System.out.println(rev);
        if(name.equals(rev)){
            System.out.println("palindrome");

        }else{
            System.out.println("not palindrome");
        }
    }
}
