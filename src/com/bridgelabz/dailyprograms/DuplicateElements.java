package com.bridgelabz.dailyprograms;

import java.util.ArrayList;

public class DuplicateElements {
    public static void main(String[] args) {
        int [] numbers = {2,4,6,8,4,6,10,10};


        for(int i = 0;i< numbers.length;i++){
            for(int j =i+1;j< numbers.length;j++){
                if (numbers[i]==numbers[j]){
                    System.out.println(numbers[j]);
                }



            }
        }

    }
}
