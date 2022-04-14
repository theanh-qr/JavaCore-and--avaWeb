package javacorn;

import java.util.Scanner;

public class theFanClass {
	final static int SLOW = 1;
	final static int MEDIUM = 2;
	final static int FAST = 3;
	boolean ON = false;
	static double radius = 5;
	static String color = "blue";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Do you want to turn on the fan?");
		String n;
		n = input.next();
		switch (n) {
		case "yes":
			turnON();
			break;
		case "no":
			turnOFF();
			break;
		}
//		if (n == "yes") {
//			turnON();
//		} else if (n == "no") {
//			turnOFF();
//		}

	}

	public static void turnON() {
		Scanner input = new Scanner(System.in);
		boolean ON = true;
		System.out.println("Fan tured on!!!");
		System.out.println("What number of fan do you want to turn on?");
		int a;
		a = input.nextInt();
		if (a == SLOW) {
			Slow();
			showFan();
		} else if (a == MEDIUM) {
			Medium();
			showFan();
		} else if (a == FAST) {
			Fast();
			showFan();
		}
	}

	public static void turnOFF() {
		System.out.print("Fan tured off!!!");
	}

	public static void Slow() {
		System.out.println("Fan turn number " + SLOW);
	}

	public static void Medium() {
		System.out.println("Fan turn number " + MEDIUM);
	}

	public static void Fast() {
		System.out.println("Fan turn number " + FAST);
	}
	
	public static void showFan() {
		System.out.println("The fan has a radius of " +radius);
		System.out.println("Fan color is "+color);
	}

}
