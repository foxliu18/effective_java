package com.TIJ14.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Part{
    public String toString() {
        return getClass().getSimpleName();
    }
    private static List<Factory<? extends Part>> partFactories = new ArrayList<Factory<? extends Part>>();
    static{
        partFactories.add(new FuelFilter.Factory());
        partFactories.add(new AirFilter.Factory());
        partFactories.add(new CabinAirFilter.Factory());
        partFactories.add(new OilFilter.Factory());
        partFactories.add(new GeneratorBelt.Factory());
        partFactories.add(new PowerSteeringBelt.Factory());
        partFactories.add(new FanBelt.Factory());

    }
    private static Random rand = new Random(47);
    public static Part createRandom(){
        int n = rand.nextInt(partFactories.size());
        return partFactories.get(n).create();
    }
}

class Filter extends Part{}
class Belt extends Part{}

class FuelFilter extends Filter{
    public static class Factory implements com.TIJ14.factory.Factory<FuelFilter>{
        public FuelFilter create(){
            return new FuelFilter();
        }
    }
}

class AirFilter extends Filter{
    public static class Factory implements com.TIJ14.factory.Factory<AirFilter>{
        public AirFilter create(){
            return new AirFilter();
        }
    }
}

class CabinAirFilter extends Filter{
    public static class Factory implements com.TIJ14.factory.Factory<CabinAirFilter>{
        public CabinAirFilter create(){
            return new CabinAirFilter();
        }
    }
}

class OilFilter extends Filter{
    public static class Factory implements com.TIJ14.factory.Factory<OilFilter>{
        public OilFilter create(){
            return new OilFilter();
        }
    }
}

class FanBelt extends Belt{
    public static class Factory implements com.TIJ14.factory.Factory<FanBelt>{
        public FanBelt create(){
            return new FanBelt();
        }
    }
}

class GeneratorBelt extends Belt{
    public static class Factory implements com.TIJ14.factory.Factory<GeneratorBelt>{
        public GeneratorBelt create(){
            return new GeneratorBelt();
        }
    }
}

class PowerSteeringBelt extends Belt{
    public static class Factory implements com.TIJ14.factory.Factory<PowerSteeringBelt>{
        public PowerSteeringBelt create(){
            return new PowerSteeringBelt();
        }
    }
}
public class RegisterFactories {
    public static void main(String[] args){
        for(int i = 0; i < 10; i++){
            System.out.println(Part.createRandom());
        }
    }
}
