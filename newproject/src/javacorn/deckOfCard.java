package javacorn;

import java.util.Scanner;

public class deckOfCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		 String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		    
		 Scanner input = new Scanner(System.in);
		 System.out.print("Card number: ");
		 int n = input.nextInt();
		 if(n <= 52 && n > 0) {
			 String suit = suits[ n / 13];
			 String rank = ranks[n % 13];
				
			 System.out.println( rank + " of " + suit);
		 }
		 else {
			 System.out.println( "Not deck!!!");
		 }
	}

}
