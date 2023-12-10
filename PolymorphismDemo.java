package org.example.java.lang.examples.polymorphism;

public interface PolymorphismDemo {

    static void main(String[] args){
        System.out.println(add(1,2));
        System.out.println(add(1.2,2));
        System.out.println(add(1,2));
    }

    static Integer add(Integer i, Integer j) throws ArithmeticException{
        System.out.println("I am in add integer");
        return i+j;
    }
    static Double add(Double i, Integer j) throws NullPointerException{
        System.out.println("I am in add double, integer");
        return i+j;
    }

    static Number add(Number i, Number j) throws Exception{
        System.out.println("I am in add number, number");
        return i.intValue()+j.intValue();
    }
}

class Parent {

    public static void staticMethod(){
        System.out.println("I am in Parent static method");
    }

    private static void staticMethod(Integer number){
        System.out.printf("I am in Parent static method %d",number);
    }


}