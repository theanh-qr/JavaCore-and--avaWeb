package VD;

import java.util.ArrayList;
import java.util.Scanner;

public class QLSVBK {
	ArrayList<SVBK> list = new ArrayList<SVBK>();
	Scanner input = new Scanner(System.in);
	int n;

	public void Y01() {
		System.out.print("Nhập số lượng sinh viên: ");
		n = Integer.parseInt(input.nextLine());
		for (int i = 1; i <= n; i++) {
			System.out.printf("---- Nhập sinh viên thứ: %d ----\n", i);
			SVBK sv = new SVBK();
			sv.nhap();
			list.add(sv); // thêm đối tượng vào array list
		}
	}

	public void Y02() {
		System.out.printf("%-20s %-10\n", "hoten", "diemtb");
		for (SVBK s : list) {
			s.xuat();
		}
	}

	public void Y03() {
		System.out.print("nhap vao khoang diem min");
		double min = input.nextDouble();
		System.out.print("nhap vao khoang diem max");
		double max = input.nextDouble();
		System.out.printf("%-20s %-10\n", "hoten", "diemtb");
		for (SVBK s : list) {
			if (s.diemtb >= min && s.diemtb <= max) {
				s.xuat();
			}
		}
	}

	public void Y04() {
		System.out.println("Nhập tên sinh viên: ");
		String ht = input.next();
		System.out.printf("%-20s %-10s\n", "Họ tên", "ĐiểmtB");
		for (SVBK s : list) {
			if (s.hoten.equalsIgnoreCase(ht)) {
				s.nhap();
			}
		}
	}

	public void Y05() {
		System.out.println("Nhập tên sinh viên: ");
		String ht = input.next();
		for (SVBK s : list) {
			if (s.hoten.equalsIgnoreCase(ht)) {
				System.out.println("----Cập nhập thông tin----");
				s.nhap();
			}
		}
		System.out.println("----Thông tin sau khi cập nhập----");
		Y02();
	}
	
	public void Y06() {
		System.out.println("Nhập tên sinh viên: ");
		String ht = input.next();
		System.out.printf("%-20s %-10s\n", "Họ tên", "ĐiểmtB");
		for (SVBK s : list) {
			if (s.hoten.equalsIgnoreCase(ht)) {
				list.remove(s);
				break;
			}
		}
		System.out.println("----Danh sách sau khi xóa----");
		Y02();
	}

}
