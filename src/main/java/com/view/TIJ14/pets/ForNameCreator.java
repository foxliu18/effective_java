package com.view.TIJ14.pets;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator {
    private static List<Class<? extends Pet>> types = new ArrayList<Class<? extends Pet>>();
    private static String[] typeNames = {
            "com.view.TIJ14.pets.Mutt",
            "com.view.TIJ14.pets.EgyptianMau",
            "com.view.TIJ14.pets.Manx",
            "com.view.TIJ14.pets.Pug",
            "com.view.TIJ14.pets.Cymric",
            "com.view.TIJ14.pets.Rat",
            "com.view.TIJ14.pets.Mouse",
            "com.view.TIJ14.pets.Hamster"
    };
    @SuppressWarnings("unchecked")
    private static void loader(){
        try{
            for(String name : typeNames){
                types.add((Class<? extends Pet>)Class.forName(name));
            }
        }catch(ClassNotFoundException e){
            throw new RuntimeException(e);

        }
    }
    static {loader();}
    public List<Class<? extends Pet>> types(){
        return types;
    }
}
