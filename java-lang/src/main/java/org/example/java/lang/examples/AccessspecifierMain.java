package org.example.java.lang.examples;

import org.example.java.lang.examples.accessspecifier.AccessSpecifierDemo;

interface AccessspecifierMain {
    static void main(String[] args){
        AccessSpecifierDemo demoParent = new AccessSpecifierDemo("In Parent");
        //public variable
        demoParent.assignMe = 100;
        //public method
        demoParent.displayAll();

        Child demoChild = new Child("In Child");
        // public variable
        demoChild.assignMe = 101;
        demoChild.testIntermediate(Double.valueOf(200));
        // public method
        demoChild.displayAll();
    }
}

class Child extends AccessSpecifierDemo {
    public Child(String restrictMe) {
        super(restrictMe);
    }

    public void testIntermediate(double d){
        //protected variable from subclass
        this.intermediate = d;
        //protected method from subclass
        this.displayFromProtected();
    }
}