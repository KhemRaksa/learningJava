package org.example;

public class StringMethods {
    public void performSomeStringMethods() {
        String name = "Bro";
        String sisname = "Sis";
        String spaceyname= "  Lol   ";

        boolean verifyNameBro = name.equals("Bro");
        boolean verifyNameSis = sisname.equalsIgnoreCase("sis");
        boolean isNameEmpty = name.isEmpty();

        name = name.toUpperCase();
        spaceyname = spaceyname.trim();

        System.out.println(verifyNameBro);
        System.out.println(verifyNameSis);
        System.out.println(isNameEmpty);
        System.out.println(name);

        System.out.println(spaceyname);
    };
}


