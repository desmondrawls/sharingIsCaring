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
		leila.iHateSharing(turn);
		mommy.beFair();
		leila.moodSwing(Mood.Insane);
		ezra.iHateSharing(turn);
		daddy.beFair();
		mommy.beFair();
		daddy.beFair();
		leila.iHateSharing(turn);
		daddy.beFair();

        ZoneDefense daddyZone = new ZoneDefense(daddy, leila);
        ZoneDefense mommyZone = new ZoneDefense(mommy, ezra);
        daddyZone.play();
        mommyZone.play();
        daddyZone.meltdown();
        mommyZone.play();
        daddyZone.play();
        daddyZone.recover();
        daddyZone.play();
        mommyZone.play();
        mommyZone.meltdown();
        mommyZone.recover();


		System.out.println("TURN: " + turn.current);
		System.out.println("LEILA'S MOOD: " + leila.mood);
		System.out.println("EZRA'S MOOD: " + ezra.mood);
		System.out.println("BALL OWNER NAME: " + ball.owner.name);
		System.out.println("BALL DAMAGE: " + ball.damage);
		System.out.println("BIKE OWNER NAME: " + bike.owner.name);
		System.out.println("BIKE DAMAGE: " + bike.damage);
	}
}