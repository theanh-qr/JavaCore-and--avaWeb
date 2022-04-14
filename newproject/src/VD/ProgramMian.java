package VD;

import java.util.Scanner;

public class ProgramMian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QLSVBK ql = new QLSVBK();
		int chon;
		while (true) {
			Scanner input = new Scanner(System.in);
			menu();
			chon = Integer.parseInt(input.nextLine());
			switch (chon) {
				case 1:
					System.out.println("1.Nhập danh sách sinh viên");
					ql.Y01();
					break;
				case 2:
					System.out.println("2.Xuất danh sách sinh viên");
					ql.Y02();
					break;
				case 3:
					System.out.println("3.Tìm kiếm sinh viên theo khoảng điểm");
					ql.Y03();
					break;
				case 4:
					System.out.println("4.Tìm thông tin theo họ tên");
					ql.Y04();
					break;
				case 5:
					System.out.println("5.Tìm kiếm và sửa thông tin theo họ tên");
					ql.Y05();
					break;
				case 6:
					System.out.println("6.Tìm kiếm sinh viên và xóa thông tin theo họ tên");
					ql.Y06();
					break;
				case 0:
					break;
				default:
					System.out.println("Chọn số từ 0-6");
			}

		}
	}

	public static void menu() {
		System.out.println("-------Menu-------");
		System.out.println("1.Nhập danh sách sinh viên");
		System.out.println("2.Xuất danh sách sinh viên");
		System.out.println("3.Tìm kiếm sinh viên theo khoảng điểm");
		System.out.println("4.Tìm thông tin theo họ tên");
		System.out.println("5.Tìm kiếm và sửa thông tin theo họ tên");
		System.out.println("6.Tìm kiếm sinh viên và xóa thông tin theo họ tên");
		System.out.println("0.Thoát");
		System.out.println("----Chọn chương trình----");
	}

}
