package Phan1;

import java.util.Scanner;

public class HinhChuNhat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		System.out.println("Nhập vào chiều dài của hình chứ nhật: ");
		a = input.nextInt();
		System.out.println("Nhập vào chiều rộng của hình chứ nhật: ");
		b = input.nextInt();
		for(int i = 1; i <= a; i++) {
			for(int j = 1; j <= b; j++) {
				System.out.print(" * ");
			}
			System.out.println("");
		}
	}
}
