package com.bridgelabz.dailyprograms;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class EvenDigit {
    public static void main(String[] args) {
        int[] numbers = {1,2,4,4,6,9,8,9,10 };
        Set<Integer>evenlist= new HashSet<>();
        ArrayList<Integer>oddlist= new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenlist.add(number);
            }else{
                oddlist.add(number);
            }
        }
        System.out.println("evenlist:"+evenlist);
        System.out.println("oddlist:"+oddlist);
    }
}
