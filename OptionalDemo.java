package org.example.java.lang.examples.optionals;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public interface OptionalDemo {
    static void main(String[] args){

        String name = "null";
        int length;
        if(name != null){
            length = name.length();
        }else{
            length = 0;
        }
        System.out.printf("length of the name is %d \n", length);

        System.out.printf("length of the name is %d".formatted(
                Optional.ofNullable(name)
                        .map(String::length)
                        .orElse(0)
        ));

        demo();
    }

    private static void print(Object o){
        System.out.println(o.toString());
    }

    private static void demo(){
        Optional<String> optString;
        //of
        optString = Optional.of("Welcome to Optional.of() demo");
        print(optString);

        //ofNullable
        optString = Optional.ofNullable(null);
        print(optString);

        //get
        optString = Optional.of("Welcome to Optional.get() demo");
        print(optString.get());

        //isPresent
        print("isPresent? %b".formatted(optString.isPresent()));
        optString = Optional.ofNullable(null);
        print("Test isPresent post creating optional.ofNullable(null)? %b".formatted(optString.isPresent()));

        //isEmpty
        print("isEmpty? %b".formatted(optString.isEmpty()));

        //ifPresent
        optString = Optional.of("Welcome to Optional.ifPresent() demo");
        optString.ifPresent((data) -> {
            System.out.println(data);
        });

        //ifPresentOrElse
        //optString = Optional.ofNullable(null);
        optString.ifPresentOrElse((data) -> {
            System.out.println(data);
        }, ()->{
            System.out.println("Welcome to Optional.ifPresentOrElse() demo.");
        });

        //filter
        //optString = Optional.of("Welcome to Optional.filter() demo");
        print(optString.filter(s -> s.contains("filter")).orElse("It is not a filter demo"));

        //flatmap
        optString = Optional.of("""
        Welcome 
        to Optional.flatmap() demo""");
        print(optString);
        print(optString.flatMap(s -> s.lines().reduce((s1, s2) -> s1 + " "+s2)).get());

        //map
        optString = Optional.of("Welcome to Optional.map() demo");
        print(optString.map(s -> s.split("\s").length).orElse(0));

        //stream
        optString.map(s -> s.split(" ")).stream().flatMap(Arrays::stream).forEach(System.out::println);

        //or
        //optString = Optional.of("Welcome to Optional.or() demo");
        optString = Optional.ofNullable(null);
        print(optString.or(() -> "it is empty".describeConstable()));

        //orElse
        print(optString.orElse("Optional String is null"));

        //orElseGet
        print(optString.orElseGet(() -> "Optional String is null. This string is from a supplier function"));

        //orElseThrow
        //optString.orElseThrow();

        //orElseThrow()
        optString.orElseThrow(() -> new NullPointerException());
    }
}
