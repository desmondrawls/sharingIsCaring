package com.example.sharing;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SharingIsCaringApplication {

    public static void main(String[] args) {
        Toy ball = new Toy("ball");
        Toy bike = new Toy("bike");
        Toddler leila = new Toddler("Leila");
        Toddler ezra = new Toddler("Ezra");
        Turn turn = new Turn();
        Parent daddy = new Parent(ball, turn);
        Parent mommy = new Parent(bike, turn);

        leila.receive(ball);
        ezra.receive(bike);
        ezra.iHateSharing(turn);
        mommy.beFair();
        leila.moodSwing(Mood.Insane);
        daddy.beFair();
        leila.iHateSharing(turn);
        mommy.beFair();
        ezra.iHateSharing(turn);
        daddy.beFair();
        leila.iHateSharing(turn);
        daddy.beFair();

        System.out.println("TURN: " + turn.current);
        System.out.println("LEILA'S MOOD: " + leila.mood);
        System.out.println("EZRA'S MOOD: " + ezra.mood);
        System.out.println("BALL OWNER NAME: " + ball.owner.name);
        System.out.println("BALL DAMAGE: " + ball.damage);
        System.out.println("BIKE OWNER NAME: " + ball.owner.name);
        System.out.println("BIKE DAMAGE: " + ball.damage);
    }
}