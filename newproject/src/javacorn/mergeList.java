package javacorn;

import java.util.Arrays;
import java.util.Scanner;

public class mergeList {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// khai bao bien
		int arrLeft[];
		int arrRight[];
		int mergedArr[];
		// nhap vao
		System.out.print("Enter list1: ");
		arrLeft = new int[input.nextInt()]; // lay so dau tien nhap vao la length
		for (int i = 0; i < arrLeft.length; i++) {
			arrLeft[i] = input.nextInt();
		}
		System.out.print("Enter list2: ");
		arrRight = new int[input.nextInt()]; // lay so dau tien nhap vao la length
		for (int i = 0; i < arrRight.length; i++) {
			arrRight[i] = input.nextInt();
		}
		// merge
		mergedArr = new int[arrLeft.length + arrRight.length];
		System.arraycopy(arrLeft, 0, mergedArr, 0, arrLeft.length);
		System.arraycopy(arrRight, 0, mergedArr, arrRight.length + 1, arrRight.length);
		// sap xep
		Arrays.sort(mergedArr); // code selection sort
		// thong bao ket qua
		for (int i : mergedArr) {
			System.out.print(i + " ");
		}
	}

}
