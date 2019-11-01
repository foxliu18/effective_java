package com.TIJ14.pets;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator {
    private static List<Class<? extends Pet>> types = new ArrayList<Class<? extends Pet>>();
    private static String[] typeNames = {
            "com.TIJ14.pets.Mutt",
            "com.TIJ14.pets.EgyptianMau",
            "com.TIJ14.pets.Manx",
            "com.TIJ14.pets.Pug",
            "com.TIJ14.pets.Cymric",
            "com.TIJ14.pets.Rat",
            "com.TIJ14.pets.Mouse",
            "com.TIJ14.pets.Hamster"
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
