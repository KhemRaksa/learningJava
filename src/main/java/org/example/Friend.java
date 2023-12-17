package org.example;

public class Friend {

    String name;
    static int numberOfFriends;
    //Static = modifier. A single copy of a variable/method is created and shared.
    //         The class "owns" the static member.

    Friend(String name){
        this.name = name;
        numberOfFriends++;
    }

    static void displayFriends() {
        System.out.println("You have " + numberOfFriends + " friends!" );
    }

}
