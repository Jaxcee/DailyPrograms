package com.bridgelabz.dailyprograms;

import java.util.HashSet;

public class PrimeFactors {
    public static void main(String[] args) {
        int n = 20;
        HashSet<Integer>factors=new HashSet<>();
        for(int i =1;i<=n;i++){
            if(n%i==0){
                factors.add(i);
                n=n/i;

            }
        }
        System.out.println(factors);
    }


}
