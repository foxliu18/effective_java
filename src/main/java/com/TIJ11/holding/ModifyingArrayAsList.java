package com.TIJ11.holding;


import java.util.*;
import static com.util.Print.print;


public class ModifyingArrayAsList {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Integer[] ia = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(ia));
        print("Before shuffling: " + list1);
        Collections.shuffle(list1, rand);
        print("After shuffling: " + list1);
        print("array: " + Arrays.toString(ia));

        List<Integer> list2 = Arrays.asList(ia);
        print("Before shuffling: " + list2);
        Collections.shuffle(list2, rand);
        print("After shuffling: " + list2);
        print("array: " + Arrays.toString(ia));
    }

}
