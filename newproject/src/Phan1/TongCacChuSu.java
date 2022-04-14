package Phan1;

import java.util.Scanner;
public abstract class TongCacChuSu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n;
		System.out.print("Nhap vao so n: ");
		n = input.nextInt();
		int sum=0;
		int x;
		
		while(n >0) {
			x= n % 10;
			n /= 10;
			sum += x;
		}
		System.out.print("Tong la: "+sum);
	}

}
