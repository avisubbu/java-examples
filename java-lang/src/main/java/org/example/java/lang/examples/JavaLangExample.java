package org.example.java.lang.examples;

import java.util.Arrays;
import java.util.function.*;

public interface JavaLangExample {
    static void main(String[] args){
        System.out.println(reduceAndConcatenate.apply(new String[]{"Hi", "This", "is", "my", "first", "tutorial"}));
        System.out.println(areaOfRectangle.apply(100.3f, 99.97f));
        transformAndPrint.accept("Avinash");
        respond.accept("Avinash", "Welcome back....!");
        System.out.println(validateName.test("Avinash"));
        System.out.println(validateName.test("Avina sh"));
        System.out.println(validateRegex.test("Avina sh", "[a-zA-Z\\s]+"));
        System.out.println(piSupplier.get());
    }

    //Function
    Function<String[], String> reduceAndConcatenate = (strings) ->
        Arrays.stream(strings).reduce("", (s1, s2) -> s1 + " "+ s2);

    //BiFunction
    BiFunction<Float, Float, Double> areaOfRectangle = (length, breadth) ->
        Double.valueOf(length * breadth);

    //Consumer
    Consumer<String> transformAndPrint = (name) ->
            System.out.printf("""
                    Hello %s! Welcome to Java session...!
                    """, name);

    //BiConsumer
    BiConsumer<String, String> respond = (name, message) ->
            System.out.printf("""
                    Hello! I am %s. %s
                    """,name, message);

    //Predicate
    Predicate<String> validateName = (name) ->
            name.matches("[a-zA-Z]+");

    //BiPredicate
    BiPredicate<String, String> validateRegex = (value, regex) ->
            value.matches(regex);

    //Supplier
    Supplier<Double> piSupplier = () -> Math.PI;
}
