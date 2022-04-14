package VD;

import java.util.Scanner;

public class SVBK {
	public String hoten;
	public double diemtb;
	
	public void nhap() {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập tên sinh viên: ");
		hoten  = input.next();
		System.out.println("Nhập điểm trung bình của sinh viên: ");
		diemtb  = input.nextDouble();
	}
	
	public void xuat() {
		System.out.printf("%-20s %-10f\n", hoten, diemtb);
	}
}
