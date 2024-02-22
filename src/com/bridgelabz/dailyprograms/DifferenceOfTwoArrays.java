package com.bridgelabz.dailyprograms;
import java.util.ArrayList;
public class DifferenceOfTwoArrays {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(3);
        b.add(5);
        b.add(6);
        b.add(7);

        for(int i=0;i< a.size();i++){
            int current = a.get(i);
            if(b.contains(current)){
                System.out.println(current +" ");
            }
        }
    }
}
