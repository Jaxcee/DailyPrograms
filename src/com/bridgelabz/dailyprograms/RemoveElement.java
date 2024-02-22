package com.bridgelabz.dailyprograms;

import java.util.ArrayList;
import java.util.Iterator;
public class RemoveElement {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);


        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number == 3) {
                iterator.remove();
            }
        }
        System.out.println(numbers);
    }
}
