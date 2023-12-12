package com.ing.zoo;

import com.ing.zoo.Animals.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        String[] commands = {"hello", "give leaves", "give meat", "perform trick"};

        Lion henk = new Lion();
        henk.name = "henk";
        Hippo elsa = new Hippo();
        elsa.name = "elsa";
        Pig dora = new Pig();
        dora.name = "dora";
        Tiger wally = new Tiger();
        wally.name = "wally";
        Zebra marty = new Zebra();
        marty.name = "marty";
        Dog jan = new Dog();
        jan.name = "jan";
        Horse erik = new Horse();
        erik.name = "erik";

        Animal[] animals = {henk, elsa, dora, wally, marty, jan, erik};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");
        String input = scanner.nextLine();

        switch (input) {
            case "hello":
                for (Animal animal : animals) {
                    animal.sayHello();
                }
                    return;
            case "give leaves":
                elsa.eatLeaves();
                dora.eatLeaves();
                marty.eatLeaves();
                erik.eatLeaves();
                return;
            case "give meat":
                henk.eatMeat();
                dora.eatMeat();
                wally.eatMeat();
                jan.eatMeat();
                return;
            case "perform trick":
                dora.performTrick();
                wally.performTrick();
                return;
        }

        if (input.startsWith(commands[0] + " ")) {
            String animalName = input.substring("hello ".length()).trim().toLowerCase();
            for (Animal animal : animals) {
                if (animalName.equals(animal.name.toLowerCase())) {
                    animal.sayHello();
                    break;
                }
            }
        }  else {
            System.out.println("Unknown command: " + input);
        }
    }
}
