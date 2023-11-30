package org.example;

import java.util.ArrayList;

public class listarrays<S> {

    // ArrayList = a resizeable array.
    //           Elements can be added and removed after compilation phase
    //           Store reference data types

    public void someArrayCalculations() {

        //Array list : add - get
        ArrayList<String> food = new ArrayList<>();

        food.add("pizza");
        food.add("rice with ginger");
        food.add("Hello micky");

        food.set(0,"Sushi");
        food.remove(2);

        for(int i = 0; i < food.size();i++){
            System.out.println(food.get(i));
        }

    }

}


