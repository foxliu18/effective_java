package com.TIJ10.innerclasses.controller;

public abstract class Event {
    private long eventTime;
    protected final long delayTime;
    public Event(long delayTime){
        this.delayTime = delayTime;
        start();
    }
    public void start(){
        //allows restarting
        eventTime = System.nanoTime() + delayTime;
    }
    public boolean ready(){ return System.nanoTime() >= eventTime; }
    public abstract void action();
}
