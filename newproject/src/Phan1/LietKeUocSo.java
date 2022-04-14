package Phan1;

import java.util.Scanner;

public class LietKeUocSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n;
		System.out.print("Nhap vao so n: ");
		n = input.nextInt();
		
		for(int i = 1; i < n; i++) {
			if(n%i == 0) {
				System.out.print(i+" ");
			}
		}
		
	}

}
