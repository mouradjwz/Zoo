package com.ing.zoo.Animals;

public class Horse extends Animal{
    @Override
    public void sayHello() {
        helloText = "hi hi hi";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "nom nom jummy";
        System.out.println(eatText);
    }
}
