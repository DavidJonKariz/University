package com.ics.trial_3.misc_animals;

public class Bird extends Animal implements AnimalInterface {
    private TypeOfBeak typeOfBeak;

    public Bird(String name, TypeOfEye typeOfEye, TypeOfBeak typeOfBeak) {
        super(name, typeOfEye);
        this.typeOfBeak = typeOfBeak;
    }

    public TypeOfBeak getTypeOfBeak() {
        return typeOfBeak;
    }

    public void setTypeOfBeak(TypeOfBeak typeOfBeak) {
        this.typeOfBeak = typeOfBeak;
    }

    public void printBirdDetails() {
        System.out.println("Name: " + getName() + "\nType of Eye: " + getTypeOfEye() + "\nType of Beak: " + typeOfBeak);
    }

    @Override
    public String toString() {
        return "Bird{" +
                "typeOfBeak=" + typeOfBeak +
                ", name='" + name + '\'' +
                ", typeOfEye=" + typeOfEye +
                '}';
    }

    @Override
    public void move() {
        System.out.println("Birds Fly.....");
    }
}
