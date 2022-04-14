package BTObject;

import java.util.Scanner;

public class Person {
	Scanner input = new Scanner(System.in);
	private String ten;
	private String gioiTinh;
	private String ngaySinh;
	private String diaChi;
	
	
	/**
	 * 
	 */
	public Person() {
		super();
	}


	/**
	 * @param ten
	 * @param gioiTinh
	 * @param ngaySinh
	 * @param diaChi
	 */
	public Person(String ten, String gioiTinh, String ngaySinh, String diaChi) {
		super();
		this.ten = ten;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
	}


	/**
	 * @return the ten
	 */
	public String getTen() {
		return ten;
	}


	/**
	 * @param ten the ten to set
	 */
	public void setTen(String ten) {
		this.ten = ten;
	}


	/**
	 * @return the gioiTinh
	 */
	public String getGioiTinh() {
		return gioiTinh;
	}


	/**
	 * @param gioiTinh the gioiTinh to set
	 */
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}


	/**
	 * @return the ngaySinh
	 */
	public String getNgaySinh() {
		return ngaySinh;
	}


	/**
	 * @param ngaySinh the ngaySinh to set
	 */
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}


	/**
	 * @return the diaChi
	 */
	public String getDiaChi() {
		return diaChi;
	}


	/**
	 * @param diaChi the diaChi to set
	 */
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	public void inputInfo() {
		System.out.println("Nhập họ tên: ");
		ten = input.nextLine();
		System.out.println("Nhập giới tính: ");
		gioiTinh = input.nextLine();
		System.out.println("Nhập ngày sinh: ");
		ngaySinh = input.nextLine();
		System.out.println("Nhập địa chỉ: ");
		diaChi = input.nextLine();
	}
	
	public void showInfo() {
		System.out.println("Họ tên của bạn là: " + ten);
		System.out.println("Giới tính của bạn là: " + gioiTinh);
		System.out.println("Ngày sinh của bạn là: " + ngaySinh);
		System.out.println("Địa chỉ của bạn là: " + diaChi);
	}
}
