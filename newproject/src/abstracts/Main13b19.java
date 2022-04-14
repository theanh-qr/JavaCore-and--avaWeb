package abstracts;

import java.util.Scanner;

public class Main13b19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        String s = input.next();
        System.out.println("The fractional number is " + new BigRational(s));
	}

}
