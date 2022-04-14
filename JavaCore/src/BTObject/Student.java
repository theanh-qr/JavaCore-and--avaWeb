package BTObject;

import java.util.Scanner;

public class Student extends Person {
	Scanner input = new Scanner(System.in);
	private String idsv;
	private float diemTb;
	private String email;
	/**
	 * 
	 */
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param ten
	 * @param gioiTinh
	 * @param ngaySinh
	 * @param diaChi
	 */
	public Student(String ten, String gioiTinh, String ngaySinh, String diaChi) {
		super(ten, gioiTinh, ngaySinh, diaChi);
		// TODO Auto-generated constructor stub
		this.idsv = idsv;
		this.diemTb = diemTb;
		this.email = email;
	}
	/**
	 * @return the idsv
	 */
	public String getIdsv() {
		return idsv;
	}
	/**
	 * @param idsv the idsv to set
	 */
	public boolean setIdsv(String idsv) {   // chuyển void thành boolean để kiểm tra biến có đúng điều kiện k
		if(idsv.length() == 8 && idsv != null) {
			this.idsv = idsv;
			return true;
		}else {
			System.err.println("Mã sinh viên phải có 8 ký tự yêu cầu nhập lại: ");
			return false;
		}
	}
	/**
	 * @return the diemTb
	 */
	public float getDiemTb() {
		return diemTb;
	}
	/**
	 * @param diemTb the diemTb to set
	 */
	public boolean setDiemTb(float diemTb) {
		if(diemTb >= 0 && diemTb <= 10) {
			this.diemTb = diemTb;
			return true;
		}else {
			System.err.println("Điểm trung bình chỉ từ 0 đến 10 yêu cầu nhập lại");
			return false;
		}
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public boolean setEmail(String email) {
		if(email != null && email.contains("@") && email.contains(" ")) {  // contains là hàm kiểm tra ký tự có tồn tại k
			this.email = email;
			return true;
		}else {
			System.out.println("Nhập sai mời nhập lại: ");
			return false;
		}
	}
	
	public boolean checkHocBong() {
		if(diemTb >= 8) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public void inputInfo() {
		//super.inputInfo();
		System.out.println("Nhập mã sinh viên: ");
		//code check đầy đủ
		while(true) {
			String idsvInput = input.nextLine();	
			boolean check = setIdsv(idsvInput);
			if(check = true) {
				break;
			}else {
				continue;
			}
		}
		//code check ngắn
		//while(!setIdsv(input.next()));
		
		System.out.println("Nhập điểm sinh viên: ");
		while(true) {
			float diemTbInput = input.nextFloat();	
			boolean check = setDiemTb(diemTbInput);
			if(check = true) {
				break;
			}
		}
		
		System.out.println("Nhập email của sinh viên: ");
		while(true) {
			String emailInput = input.nextLine();	//Nhập vào
			boolean check = setEmail(emailInput); //truyền biến nhập vào hàm set
			if(check = true) {  //nếu true thì thoát khỏi vòng lặp còn k thì bắt nhập lại đến khi nào đúng thì thôi
				break;
			}
		}
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("Mã sinh viên của bạn là: " + idsv);
		System.out.println("Điểm của bạn là: " + diemTb);
		System.out.println("Email của bạn là: " + email);
	}
	
	
	
}
