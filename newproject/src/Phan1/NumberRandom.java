package Phan1;

import java.util.Random;
import java.util.Scanner;

public class NumberRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input;
		Scanner inputs = new Scanner(System.in);
		input = inputs.nextInt();
		int count = 0;
		Random random = new Random();
		while(true) {
			int ranNumber = random.nextInt(100);
			count++;
			System.out.println("Random number: " + ranNumber+ " Input: " +input);
			if(ranNumber == input) {
				System.out.println("Thực hiện "+count+ " lần.");
				break;
			}
		}
	}

}
