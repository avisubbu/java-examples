package org.example.java.lang.examples.accessspecifier;

public interface DefaultDemo {
    static void main(String[] args){
        AccessSpecifierDemo demo = new AccessSpecifierDemo("201");

        // public variable
        demo.assignMe = 1000;
        // protected variable
        demo.intermediate = Double.valueOf(3000);
        //default variable
        demo.nothingSpecified = 2.0f;
        // default method
        demo.tryToInvoke();
        //protected method
        demo.displayFromProtected();;
        //public method
        demo.displayAll();
    }
}
