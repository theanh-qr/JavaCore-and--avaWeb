package BTObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> studentList = new ArrayList<>();
		Student student = new Student();
		
		boolean program = true;
		while(program) {
			System.out.println("---Chon trương trình---");
			menu();
			int chon = input.nextInt();
			switch (chon) {
			case 1:
				System.out.println("Nhập vào số lượng sinh viên: ");
				int soLSV = input.nextInt();
				for(int i = 1; i <= soLSV; i++) {
					System.out.println("Nhập sinh viên thứ "+i);
					student.inputInfo();
					studentList.add(student);
				}
				break;
			case 2:
				System.out.println("---Thông tin của tất cả sinh viên--- ");
				for(int i = 0; i < studentList.size(); i++) {
					studentList.get(i).showInfo();
				}
			case 3:
				System.out.println("Hiển thị thông tin sinh vien có điểm cao nhât và thấp nhất");
				int maxIndex = 0, minIndex =0;
				float maxDiemTb, minDiemTb;
				minDiemTb = studentList.get(0).getDiemTb();
				maxDiemTb = studentList.get(0).getDiemTb();
				
				for(int i = 0; i < studentList.size(); i++) {
					if(studentList.get(i).getDiemTb() < minDiemTb) {
						minIndex = i;
						minDiemTb = studentList.get(i).getDiemTb();						
					}
					
					if(studentList.get(i).getDiemTb() > maxDiemTb) {
						maxIndex = i;
						maxDiemTb = studentList.get(i).getDiemTb();						
					}
				}
				System.out.println("Sinh viên có điểm trung bình cao nhất: ");
				studentList.get(maxIndex).showInfo();
				System.out.println("Sinh viên có điểm trung bình thấp nhất: ");
				studentList.get(minIndex).showInfo();
				break;
			case 4:
				System.out.println("Nhập mã sinh viên cần tìm kiếm: ");
				String maSvSearch = input.nextLine();
				
				int count = 0;
				for(Student s : studentList) {
					if(s.getIdsv().equalsIgnoreCase(maSvSearch)) {
						s.showInfo();
						count++;
					}
				}
				if(count == 0) {
					System.out.println("Không tìm thấy sinh viên nào!!!");
				}
				
				break;
			case 5:
				//Sắp xếp thông tin sinh viên theo thứ tự A đến Z
				Collections.sort(studentList, new Comparator<Student>() {

					@Override
					public int compare(Student o1, Student o2) {
						// TODO Auto-generated method stub
						int cmp = o1.getTen().compareTo(o2.getTen());
						if(cmp >= 0) {
							return -1;
						}
						return 1;
					}
				});
				//Hiển thị
				for(int i = 1; i <= studentList.size(); i++) {
					studentList.get(i).showInfo();
				}
				break;
			case 6:
				
				break;
			case 7:
				System.out.println("Chương trình kết thúc !!!");
				program = false;
				break;
			default:
				System.out.println("Chọn trương trình từ 1 đến 7");
				break;
			}
		}		
	}
	
	public static void menu() {
		System.out.println("Menu chương trình");
		System.out.println("1.Nhập vào số lượng sinh viên.");
		System.out.println("2.Hiển thị thông tin tất cả các sinh viên ra màn hình.");
		System.out.println("3.Hiển thị sinh viên có điểm trung bình cao nhất và thấp nhất.");
		System.out.println("4.Tìm kiếm sinh viên theo mã sinh viên.Nhập vào mã sinh viên để tìm.");
		System.out.println("5.Hiện thì tất cả các sinh viên theo thứ tự tên của bảnh chữ cái(A -> Z).");
		System.out.println("6.Hiển thị tất cả các sinh viên được học bổng, và sắp xếp theo thứ tự điểm từ cao xuống thấp");
		System.out.println("7.Thoát chương trình");
	}
}
