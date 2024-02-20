package com.bridgelabz.dailyprograms;
import java.util.Scanner;
public class FibonacciSeriees {
    public static void main(String[] args) {
        int n =34;
        int numOne = 0;
        int numTwo =1;
        for(int i = 1;i<=n;i++){
            System.out.print(numOne+" ");
            int nextTerm = numOne + numTwo;
            numOne = numTwo;
            numTwo=nextTerm;

        }
    }
}
