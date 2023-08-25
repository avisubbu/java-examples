package org.example.java.lang.examples.oop.polymorphism;

public interface Polymorph {
    static void main(String[] args){
        Parent p = new Parent();
        System.out.println("SquareIt Number: "+p.squareIt(5));
        System.out.println("SquareIt Number, Number: "+p.squareIt(5,6));

        Child c = new Child();
        System.out.println("SquareIt Number: "+c.squareIt(10));
        c.display(10,10);
    }
}

class Parent {
    public Number squareIt(Number x){
        System.out.println("In Parent");
        return x.intValue()*x.intValue();
    }

    protected Number squareIt(Number x, Number y){
        System.out.println("In Parent");
        return (x.intValue()+y.intValue())*(x.intValue()+y.intValue());
    }

    private Number squareIt(double x){
        System.out.println("In Parent");
        return x*x;
    }
}

class Child extends Parent{
    public Integer squareIt(Number x){
        System.out.println("In Child");
        Number n = super.squareIt(x);
        return (Integer) n;
    }

    private Integer squareIt(Integer x, Integer y){
        System.out.println("In Child");
        Number n = super.squareIt(x,y);
        return (Integer) n;
    }

    public void display(Integer x, Integer y){
        System.out.println(squareIt(x,y));
    }
}