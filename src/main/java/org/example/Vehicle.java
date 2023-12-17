package org.example;

public abstract class Vehicle {

    // abstract = abstract classes cannot be instantiated, but they can have a subclass
    //            abstract methods are declared without an implementation

    double speed;

    abstract void go();

    void stop() {
        System.out.println("This vehicle stopped");
    }


}

