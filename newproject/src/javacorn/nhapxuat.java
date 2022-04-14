package javacorn;

import java.util.Scanner;

public class nhapxuat {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap so phan tu cua mang");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		show(arr);
	}
	public static void show(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0 && arr[i] % 5 != 0) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
