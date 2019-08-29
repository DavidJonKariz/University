package com.ics.trial_3;

import com.ics.trial_3.misc_animals.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Trial3Application {

    public static void main(String[] args) {
        SpringApplication.run(Trial3Application.class, args);

        Fish fish = new Fish("Tilapia", TypeOfEye.SIMPLE, 4);
        Bird bird = new Bird("Chicken", TypeOfEye.COMPOUND, TypeOfBeak.BLUNT);
        Mammal mammal = new Mammal("Human", TypeOfEye.SIMPLE, 2, 9);

        System.out.println(fish.toString());
        fish.move();
        System.out.println(bird.toString());
        bird.move();
        System.out.println(mammal.toString());
        mammal.move();
    }

}
