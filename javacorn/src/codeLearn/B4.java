package codeLearn;
import java.util.Scanner;
public class B4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int a;
		int b;
		System.out.print("Nhap vao so a: ");
		a = input.nextInt();
		System.out.print("Nhap vao so b: ");
		b = input.nextInt();
		
		int tong = a + b;
		int hieu = a - b;
		int tich = a * b;
		int thuong = a / b;
		
		System.out.println("Tong 2 so la: " + tong);
		System.out.println("Hieu 2 so la: " + hieu);
		System.out.println("Tich 2 so la: " + tich);
		System.out.println("Thuong 2 so la: " + thuong);
		
		System.out.println("Tong " + a + " + "+ b +" la " + tong);
		System.out.println(a + b);
		System.out.println("a + b = " + (a + b));
	}

}
