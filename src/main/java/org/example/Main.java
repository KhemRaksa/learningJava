package org.example;

import org.example.StringMethods;
import org.example.GUI;
import org.example.Wrapper;
import org.example.listarrays;
import org.example.stackkk;
import org.example.qqqqqq;
import org.example.twodarraylist;
import org.example.foreach;
import org.example.Car;
import org.example.Human;
import org.example.Pizza;
import org.example.Bicycle;
import org.example.MyThread;

import javax.swing.*;
import javax.swing.plaf.basic.BasicDesktopIconUI;
import java.awt.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) {

            /*
                printf() = an optional method to control, format, and display text to the console window
                           two arguments  = format string + (object/variable/value)
                           % [flags] [precision] [width] [conversion-character]


             */

//        boolean myBoolean = true;
//        char myChar = '@';
//        String myString = "Bro";
//        int myInt = 50;
//        double myDouble = 1000;
//
//        final double PI = 3.14159;
//        System.out.println(PI);

        //System.out.prinimport java.io.File;tf("%d This is a formatted string ", 123);
        //System.out.printf("%b", myBoolean);
        //System.out.printf("%s",myChar);

//          Car car1 = new Car();
//          System.out.println(car1);
//          System.out.println(car1.toString());


//
//        Human human1 = new Human("Raksa",65,70);
//        Human human2 = new Human("Morty",70,80);
//
//        human1.eat();
//        human2.drink();
//
//        System.out.println(human1.name);
//        System.out.println(human1.age);

//          DiceRoller diceRoller = new DiceRoller();
//
//          diceRoller.roll();

//          Pizza pizza = new Pizza("Thick crust","tomato","mozzerella","pepperoni");
//          System.out.println(pizza.sauce);
//          System.out.println(pizza.bread);
//          System.out.println(pizza.cheese);
//          System.out.println(pizza.topping);
//
//          Pizza noToppingPizza = new Pizza("Thick crust","tomato","notoppingcheese");
//          System.out.println(noToppingPizza.cheese);

//        System.out.println(car1.model);
//        System.out.println(car1.year);
//        System.out.println(car1.color);
//
//        myCar2.color = "Jet Black";
//        System.out.println(myCar2.color);

//        int[] numbers = new int[3];
//        char[] characters = new char[4];
//        String[] strings = new String[5];
//
//        Food food1 = new Food("Pizza");
//        Food food2 = new Food("Hamburger");
//        Food food3 = new Food("hotdog");
//
//        Food[] refrigerator = {food1,food2,food3};
//
//        System.out.println(refrigerator[0].name);

//         Garage garage = new Garage();
//         Car car = new Car("RR");
//         Car car2 = new Car("Tesla");
//         garage.park(car);
//         garage.park(car2);

        // static keyword is used in class
//        Friend friend1 = new Friend("RR");
//        Friend friend2 = new Friend("Patrick");
//        Friend friend3 = new Friend("Squidward");
//
//        System.out.println(Friend.numberOfFriends);
//
//        Friend.displayFriends();

//        Car car = new Car("RR");
//        car.go();
//
//        Bicycle bike = new Bicycle();
//
//        System.out.println(car.doors);
//        System.out.println(bike.pedals);
            
//          Animal animal = new Animal();
//          animal.speak();
//
//          Dog dog = new Dog();
//          dog.speak();

//          Hero hero1 = new Hero("Batman",42,"$$$");
//          Hero hero2 = new Hero("Superman",43,"Everything");
//
//          System.out.println(hero1.name);
//          System.out.println(hero1.age);
//          System.out.println(hero1.power);

//          System.out.println(hero2.toString());

            // Use abstract to prevent generic classes from being initiated a certain type of vehicle
            //Vehicle vehicle = new Vehicle(); In this case, we have to select
//            Car car1 = new Car("Chevrolet","Camaro",2021);
//            Car car2 = new Car("Ford","Mustang",2022);
//
//            // this is not copying, this makes two car1 variables essentially
//            car2 = car1;
//
//            car2.copy(car1);
//
//
//            System.out.println(car1);
//            System.out.println(car2);
//            System.out.println();
//            System.out.println(car1.getMake());
//            System.out.println(car1.getModel());
//            System.out.println(car1.getYear());
//            System.out.println();
//            System.out.println(car2.getMake());
//            System.out.println(car2.getModel());
//            System.out.println(car2.getYear());
//

//              Rabbit rabbit = new Rabbit();
//              rabbit.flee();

//              Hawk hawk = new Hawk();
//              hawk.hunt();
//
//              Fish fish = new Fish();
//              fish.flee();

              // Polymorphism = greek word for poly - many, morph - "form"
              // Car Bicycle and Boat all extend Vehicle

//              Car car = new Car("Camry","Toyota",2019);
//              Bicycle bicycle = new Bicycle();
//              Boat boat = new Boat();
//
//              Vehicle[] racers = {car,bicycle,boat};

//              car.go();
//              bicycle.go();
//              boat.go();

//              for(Vehicle x : racers) {
//                  x.go();
//              }

            //Dynamic Polymorphism
//            many shapes / forms after compilmation

//            Scanner scanner = new Scanner(System.in);
//             Animal animal;
//
//             System.out.println("What animal do you want ?");
//             System.out.println("(1 = dog) or (2 = cat): ");
//
//             int choice =  scanner.nextInt();
//
//             if(choice == 1){
//                 animal = new Dog();
//                 animal.speak();
//             }else if(choice == 2){
//                 animal = new Cat();
//                 animal.speak();
//             }else{
//                 animal = new Animal();
//                 System.out.println("That choice was invalid");
//             }

                //Handling exceptions
                // An event that occurs during the execution of a program that, disrupts the normal flow of instructions

//                try {
//
//                    Scanner scanner = new Scanner(System.in);
//
//                    System.out.println("Enter a whole number to divide:");
//                    int x = scanner.nextInt();
//
//                    System.out.println("Enter a whole number to divide by:");
//                    int y = scanner.nextInt();
//
//                    int z = x / y;
//
//                    System.out.println("Result " + z);
//
//                }catch(ArithmeticException e) {
//                     System.out.println("You can't divide by zero, idiot");
//                }
//                catch(InputMismatchException e) {
//                    System.out.println("Please enter a whole number");
//                }

                // File = an abstract represetation of file and directory pathnames
                // Take it from source, it will exist
//                File file = new File("src/main/java/org/example/secret.txt");
//
//                if(file.exists()) {
//                    System.out.println("That file exists!: :O!");
//                    System.out.println(file.getAbsolutePath());
//                    System.out.println(file.getPath());
//                    System.out.println(file.isFile());
//                    file.delete();
//                }else{
//                    System.out.println("That file doesn't exist");
//                }

//            Bicycle bike = new Bicycle();
//            bike.go();

              //FileWriters in Java to write to a file
//              try {
//                  FileWriter writer = new FileWriter("Poem.txt");
//                  writer.write("Roses are red \n Booty Booty Booty \n Rocking Ro");
//                  writer.append("lellele");
//                  // Be sure to close writer
//                  writer.close();
//              }
//              catch (IOException e){
//                  e.printStackTrace();
//              }

              //FileReader to read the contents of a file
//            try {
//                FileReader reader = new FileReader("Poem.txt");
//                int data = reader.read();
//                while(data != -1){
//                    System.out.print((char)data);
//                    data = reader.read();
//                }
//                reader.close();
//            }catch(IOException e){
//                e.printStackTrace();
//            }

            // JFrame = A GUI window to add components to

//            JFrame frame = new JFrame();
//            frame.setTitle("JFrame");
//            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            frame.setResizable(false); // prevent frame from being resized
//            frame.setSize(420,420); // sets the x-dimension and y-dimension
//            // We can also change the icon
//            frame.setVisible(true); //Make frame visible
//            frame.getContentPane().setBackground(Color.black); // Change color of background

              /*

                Thread = A thread of execution in a program (like a virtual CPU).
                Each thread can execute parts of your code in parallel with the main thread
                Each thread has a priority
                Threads with higher priority are executed in preference compareed to threads with lower priority.

                When a JVM starts, a main thread is called
                it's called main

               */

                Thread.currentThread().setName("MAIINNNNNNN");
                System.out.println(Thread.activeCount());
                System.out.println(Thread.currentThread().getName());

                //The higher the number the bigger priority for the thread
                // 10 is highest priority, 1 is lowest priority
                Thread.currentThread().setPriority(10);
                System.out.println(Thread.currentThread().getPriority());

                System.out.println(Thread.currentThread().isAlive());

//                for(int i = 3; i > 0; i--){
//
//                    try {
//                        System.out.println(i);
//                        Thread.sleep(10000);
//                    } catch (InterruptedException e) {
//
//                    }
//                }

                // Daemon thread is a low priority thread that runs in background to perform

                MyThread thread2 = new MyThread();
                thread2.start();
                System.out.println(thread2.isAlive());
                System.out.println(thread2.getName());

                thread2.getPriority();
    }

//    static void hello (String name, int age) {
//        System.out.println("Hello " + name);
//        System.out.println("You are " + age + " years old");
//    }
//
//    static int add(int a, int b) {
//        System.out.println("This is overloaded method #1");
//        return a + b;
//    }
//
//    static int add(int a, int b, int c) {
//        System.out.println("This is overloaded method #2");
//        return a + b + c;
//    }
//
//    static int add(int a, int b, int c, int d) {
//        System.out.println("This is overloaded method #3");
//        return a + b + c + d
//        ;
//    }
//
//    static double add(double a, double b){
//            System.out.println("This is the double overloaded method");
//            return a + b;
//    }


}

