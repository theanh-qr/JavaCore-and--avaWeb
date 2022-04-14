package ClassAndObject;

import java.util.Scanner;

public class StudentsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students [] students = new Students[10];
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhap vao ma sinh vien");
		String maSinhVien = input.next();
		
		System.out.println("Nhap vao ho va ten sinh vien");
		String name = input.next();
		
		System.out.println("Nhap vao dia chi cua sinh vien");
		String diaChi = input.next();
		
		System.out.println("Nhap vao so dien thoai cua sinh vien");
		double soDienThoai = input.nextDouble();
		
		System.out.println("Nhap vao bai tap cua sinh vien");
		String baiTap= input.next();
		
		System.out.println("Nhap vao hoc phi can nop sinh vien");
		double hocPhi = input.nextDouble();
		
		
		
		Students s = new Students();
		s.diHoc(name);
		s.lamBaiTap(name, baiTap);
		s.nopHocphi(name, hocPhi);
		System.out.println("Thong tin cua sinh vien");
		s.thongTinSV(maSinhVien, name, diaChi, soDienThoai);
	}

}
