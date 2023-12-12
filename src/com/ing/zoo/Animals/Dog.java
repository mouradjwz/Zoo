package com.ing.zoo.Animals;

public class Dog extends Animal{


    @Override
    public void sayHello() {
        helloText = "WOOF WOOF";
        System.out.println(helloText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom Woof Woof thx";
        System.out.println(eatText);
    }
}
