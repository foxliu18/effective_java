package com.TIJ21.concurrency;

public class BasicTreads {
    public static void main(String[] args){
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Wait for LiftOff");
    }
}
