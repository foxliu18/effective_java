package com.TIJ13.strings;

import static com.util.Print.print;

public class Replacing {
    static String s = Splitting.knights;
    public static void main(String[] args){
        print(s.replaceFirst("f\\w+", "located"));
        print(s.replaceAll("shrubbery|tree|herring", "banana"));
    }
}
