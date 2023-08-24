package org.example.java.lang.examples;

import java.util.ArrayList;
import java.util.Collection;

interface Relationship {

    static void main(String[] args){
        //Association
        Animal mammal = new Mammal(), reptile = new Reptile();
        System.out.println(mammal.typeofMovement());
        System.out.println(reptile.typeofMovement());

        //Aggregation
        House house = new House();
        house.residents = new ArrayList<>();
        house.residents.add(new People());

        house.residents.stream().forEach(People::show);

        //Composition
        HumanBeing human = new HumanBeing();
        System.out.println(human.whatDoesYourBrainDo());
    }
}

class HumanBeing{
    private Brain brain;

    public HumanBeing(){
        this.brain = new Brain();
    }

    class Brain{
        public String action(){
            return "I think";
        }
    }

    public String whatDoesYourBrainDo(){
        return this.brain.action();
    }
}

class House{
    Collection<People> residents;
}

class People {
    public void show(){
        System.out.println("I am a resident");
    }
}

interface Animal {
    String typeofMovement();
}
class Mammal implements Animal{

    @Override
    public String typeofMovement() {
        return "Walks";
    }
}
class Reptile implements Animal{

    @Override
    public String typeofMovement() {
        return "Crawls";
    }
}