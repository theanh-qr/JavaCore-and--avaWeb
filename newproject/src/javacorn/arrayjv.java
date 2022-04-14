package javacorn;

import java.util.Scanner;

public class arrayjv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float tong=0;
		int dem = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n = input.nextInt();
		float arr[] = new float[n];
		System.out.print("Enter the number: ");
		for(int i = 0; i <n; i++) {
			System.out.println("Enter number at "+i);
			arr[i] = input.nextFloat();
		}
		for(int j = 0; j < arr.length; j++) {
			tong += arr[j];
		}
		float average = tong/ arr.length;
		System.out.println("Average is: "+average);
		for(int k = 0; k < arr.length; k++) {
			if(average < arr[k]) {
				 dem++;
			}
		}
		System.out.println("Number of elements..... "+dem);
		
	}

}
