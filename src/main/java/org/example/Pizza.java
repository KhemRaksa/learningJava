package org.example;

public class Pizza {

    //Overloaded constructors = multiple constructors within a class with the same name, but have different params

    String bread;
    String sauce;
    String cheese;
    String topping;

    //No topping pizza
    Pizza(String bread, String sauce, String cheese ){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    Pizza(String bread, String sauce, String cheese, String topping){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }


}
