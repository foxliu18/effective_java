package com.TIJ08.polymorphism.shape;

import static com.util.Print.print;

public class Square extends Shape {
    @Override
    public void draw() {
        print("Square draw");
    }
    @Override
    public void erase(){
        print("Square erase");
    }
    public void reshape(){
        print("Square.reshape");
    }
}
