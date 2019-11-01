package com.TIJ14;

import static jdk.nashorn.internal.objects.Global.print;

interface HasBatteries{}
interface Waterproof{}
interface Shoots{}
interface Activate{}

class Toy{
    Toy(){} //虚拟构造器
    Toy(int i){}
}
class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots, Activate{
    FancyToy(){super(1);}
}

public class ToyTest {
    public static void printInfo(Class cc){
        System.out.println("Class name:" + cc.getName() + " is interface? [" + cc.isInterface() + "]");
        System.out.println("Simple name: " + cc.getSimpleName());
        System.out.println("Canonical name:" + cc.getCanonicalName());
    }

    public static  void test(){
        Class c = null;
        try{
            c = Class.forName("com.TIJ14.FancyToy");
        }catch (ClassNotFoundException e){
            print("Can't find FancyToy");
            System.exit(1);
        }

        ToyTest.printInfo(c);
        for(Class face : c.getInterfaces())
            ToyTest.printInfo(face);
        Class up = c.getSuperclass();
        Object obj = null;
        try{
            obj = up.newInstance();//实现虚拟构造器
        }catch (InstantiationException e){
            System.out.println("Cannot instantiate");
            System.exit(1);
        }catch (IllegalAccessException e){
            System.out.println("Cannot access");
            System.exit(1);
        }
        ToyTest.printInfo(obj.getClass());
    }

}
