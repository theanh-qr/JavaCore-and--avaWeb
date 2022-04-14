package VD;

import java.util.Scanner;

public class CongTy {
	public int mNV;
	public String hoTen;
	public int luong;
	public int luongTN;
	public int hoaHong;
	Scanner input = new Scanner(System.in);
	public void nhapTTCB() {
		System.out.print("Nhập tên của nhân viên");
		hoTen = input.next();
		
		System.out.print("Nhập mã của nhân viên");
		mNV = input.nextInt();
		
		System.out.print("Nhập lương của nhân viên");
		luong = input.nextInt();
	}
	public void luongTrachNhiem() {
		System.out.print("Nhập lương trách nhiệm của trường phòng");
		Scanner input = new Scanner(System.in);
		luongTN = input.nextInt();
	}
	
	public void hoaHong() {
		System.out.print("Nhập hoa hông của tiếp viên");
		Scanner input = new Scanner(System.in);
		hoaHong = input.nextInt();
	}
	
	public void xuatTTCB() {
		System.out.printf("%-20s %-20s %-10d\n",mNV ,hoTen, luong);
	}
}
