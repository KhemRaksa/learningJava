package org.example;

// Inheritance
public class Car extends Vehicle{

//    String name;
//    int wheels = 4;
//    int doors = 4;
//
//    @Override
//    void go() {
//        System.out.println("The car is revvingggg");
//    }
//
//    Car(String name){
//        this.name = name;
//    }

    private String make;
    private String model;
    private int year;

    Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // When we want to access private stuff, we use getters

    public String getMake(){
        return this.make;
    }

    public String getModel(){
        return this.model;
    }

    public int getYear(){
        return this.year;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setMake(String make){
        this.make = make;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void copy(Car car){
        this.model = car.model;
        this.make = car.make;
        this.year = car.year;
    }

    @Override
    void go() {
        System.out.println("Rnggggg Rnngggg");
    }
}
