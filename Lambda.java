package org.example.java.lang.examples.latest;

@FunctionalInterface
interface I {
    Integer testMe(String name);

    default void abstractMe(){}
}

public interface Lambda {
    static void main(String[] args){
        I i = new I() {
            @Override
            public Integer testMe(String name) {
                return name.length() * name.length();
            }
        };
        System.out.println(i.testMe("Avinash"));

        //Lambda
        I lambda = (name) ->  name.length() * name.length();
        System.out.println(lambda.testMe("Avinash"));
    }
}
