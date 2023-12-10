package org.example.java.lang.examples.interfaces;

public interface InterfaceDemo {
    static void main(String[] args){
        Parent child = new ChildTest();
        child.finalMeth();
    }
}

@FunctionalInterface
interface IPraent{
    void thisIsMyAlgo();
}

abstract class Child implements IPraent{
}

class Parent{
    public final void finalMeth(){
        System.out.println("This is a final method supposed not to be overridden...!");
    }
}

class ChildTest extends Parent{}