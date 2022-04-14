package Phan1;

import java.util.Scanner;

public class TinhTongNghichDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int n;
		n = input.nextInt();
		
		double sum = 0;
		for(int i = 1; i <= n; i++) {
			sum = (double)1/i;
		}
		System.out.print("Kết quả là: " + sum);
	}

}
