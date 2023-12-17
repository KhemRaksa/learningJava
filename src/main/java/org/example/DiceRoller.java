package org.example;

import java.util.Random;

public class DiceRoller {

    Random random;
    int number = 0;

    // Our constructor counts as a method
    DiceRoller() {
        random = new Random();
        roll();
    }
    void roll() {
        number = random.nextInt(6)+1;
        System.out.println(number);

    }

}
