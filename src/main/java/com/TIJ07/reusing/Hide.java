package com.TIJ07.reusing;

import static com.util.Print.print;

class Home{
    char doh(char c){
        print("doh(char)");
        return 'd';
    }
    float doh(float f){
        print("doh(float)");
        return 1.0f;
    }
}
class MilHouse{}
class Bart extends Home{
    void doh(MilHouse m){
        print("doh(MilHouse)");
    }
}
public class Hide {
    public static void main(String[] args){
        Bart b = new Bart();
        b.doh(1);
        b.doh('x');
        b.doh(1.0f);
        b.doh(new MilHouse());
    }
}
