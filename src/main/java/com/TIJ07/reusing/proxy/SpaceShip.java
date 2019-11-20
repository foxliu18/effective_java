package com.TIJ07.reusing.proxy;

public class SpaceShip extends SpaceShipControls {
    private String name;
    public SpaceShip(String name){this.name = name;}
    public String toString() { return name; }
    public static void main(String[] args){
        SpaceShip protector = new SpaceShip("NASA Protector");
        protector.forward(100);
    }
}
