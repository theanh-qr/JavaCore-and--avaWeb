package javacorn;

import java.util.Scanner;

public class exploreMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int n;
		System.out.print("Enter the size for the matrix: ");
		n = input.nextInt();

		int a[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = input.nextInt();
			}
		}
		System.out.println("Array: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}

}
