package com.TIJ11.holding;

import com.TIJ14.pets.*;

import java.util.*;

import static com.util.Print.*;

public class ListFeatures {
    public static void main(String[] args){
        Random rand = new Random();
        List<Pet> pets = Pets.arrayList(7);
        print("1: " + pets);
        Hamster h = new Hamster();
        pets.add(h);
        print("2: " + pets);
        print("3: " + pets.contains(h));
        pets.remove(h);
        Pet p = pets.get(2);
        print("4: " + p + " " + pets.indexOf(p));
        Pet cymric = new Cymric();
        print("5: " + pets.indexOf(cymric));
        print("6: " + pets.remove(cymric));
        print("7: " + pets.remove(p));
        print("8: " + pets);
        pets.add(3, new Mouse());
        print("9: " + pets);
        List<Pet> sub = pets.subList(1, 4);
        print("subList: " + sub);
        print("10: " + pets.containsAll(sub));
//        Collections.sort(sub);
        print("sorted subList: " + sub);
    }
}
