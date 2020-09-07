package com.zoo.animal;

public class Panthers extends Animal {

    protected boolean successfulPredator;


    public boolean isSuccessfulPredator() {
        return successfulPredator;
    }
    public void setSuccessfulPredator(boolean successfulPredator) {
        this.successfulPredator = successfulPredator;
    }
    public Panthers() {
        super();
    }
    public Panthers(String name, int age, String character, String color, String kind, boolean successfulPredator) {
        super();
        this.name = name;
        this.age = age;
        this.character = character;
        this.kind = kind;
        this.color = color;
        this.successfulPredator = successfulPredator;

    }

    public void say() {
        System.out.println("Мау!");
    }

    public void play() {
        System.out.println("Я люблю охотиться, это моя игра!");
    }


    public void contrive() {
        int rand = 0;
        int rand2 = 100;
        int num = rand + (int)(Math.random() * rand2);
        System.out.println("Я придумал число: " + num);

    }
    public void walkAtNight() {
        System.out.println("Я гуляю ночью");

    }

    public void markBoundaries() {
        System.out.println("Я мечу свою территорию");

    }



}