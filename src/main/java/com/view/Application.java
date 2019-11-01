package com.view;


import com.view.TIJ14.ClassInitialization;
import com.view.TIJ14.FilledList;
import com.view.TIJ14.PetCount;
import com.view.TIJ14.ToyTest;
import com.view.TIJ14.pets.ForNameCreator;

public class Application {

    public static void main(String[] args){
        PetCount.countPets(new ForNameCreator());
    }
}
