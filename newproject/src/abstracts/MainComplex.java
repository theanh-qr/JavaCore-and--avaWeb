package abstracts;

import java.util.Scanner;

public class MainComplex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		// khoi tao 2 objects luu tru cac so complex
		double complexParts[] = new double[2];
		System.out.print("Please enter first complex number: ");
		for (int i = 0; i < complexParts.length; i++) {
			complexParts[i] = input.nextDouble();
		}
		Complex complexNumberOne = new Complex(complexParts[0], complexParts[1]);
		System.out.print("Please enter second complex number: ");
		for (int i = 0; i < complexParts.length; i++) {
			complexParts[i] = input.nextDouble();
		}
		Complex complexNumberTwo = new Complex(complexParts[0], complexParts[1]);
		// in ket qua cac phep tinh ra man hinh
		System.out.print(complexNumberOne.toString() + " + " + complexNumberTwo.toString() + " = "
				+ complexNumberOne.add(complexNumberTwo)+"\n");
		System.out.print(complexNumberOne.toString() + " - " + complexNumberTwo.toString() + " = "
				+ complexNumberOne.subtract(complexNumberTwo)+"\n");
		System.out.print(complexNumberOne.toString() + " * " + complexNumberTwo.toString() + " = "
				+ complexNumberOne.multiply(complexNumberTwo)+"\n");
		System.out.print(complexNumberOne.toString() + " / " + complexNumberTwo.toString() + " = "
				+ complexNumberOne.divide(complexNumberTwo)+"\n");
		System.out.print("| " + complexNumberOne.toString() + " | = " + complexNumberOne.abs());
	}

}
