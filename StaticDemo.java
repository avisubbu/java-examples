package org.example.java.lang.examples.staticdemo;

public class StaticDemo {

    static {
        System.out.println("My First static block");
    }
    private static Integer value = 20;

    public StaticDemo(){
        System.out.println("I am in Constructor");
    }

    static {
        displayData(value);
        System.out.println("My Second static block");
    }

    public static void main(String[] args){
        new StaticDemo();
        displayData(value);
        Parent.Inner innerObj = new Parent.Inner(25);
        System.out.println(innerObj.getData());
    }

    private static void displayData(int value){
        System.out.println(value);
    }
}

class Parent{
    static class Inner{
        public Integer getData() {
            return data;
        }

        Inner(Integer data){
            this.data = data;
        }
        private Integer data;

    }
}