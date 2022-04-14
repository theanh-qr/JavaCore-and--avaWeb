package ClassAndObject;

public class Students {
	private String maSinhVien;
	private String hoTen;
	private String diaChi;
	private String email;
	private double soDienThoai;
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Students(String maSinhVien, String hoTen, String diaChi, String email, double soDienThoai) {
		super();
		this.maSinhVien = maSinhVien;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.email = email;
		this.soDienThoai = soDienThoai;
	}

	public String getMaSinhVien() {
		return maSinhVien;
	}
	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(double soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	
	
	public void diHoc(String name) {
		
		System.out.println("Sinh vien "+name+" da di hoc!");
	}
	
	public void lamBaiTap(String name, String baiTap) {
		System.out.println("Sinh vien "+name+" dang lam bai tap "+ baiTap);
	}
	
	public void nopHocphi(String name, double hocPhi) {
		System.out.println("Sinh vien "+name+" da nop hoc phi "+ hocPhi);
	}
	
	
	@Override
	public String toString() {
		return "Students [maSinhVien=" + maSinhVien + ", hoTen=" + hoTen + ", diaChi=" + diaChi + ", email=" + email
				+ ", soDienThoai=" + soDienThoai + "]";
	}

	public void thongTinSV(String maSinhVien ,String name,String diaChi,double soDienThoai) {
		System.out.println("Ma sinh vien: " + maSinhVien);
		System.out.println("Ho va ten sinh vien: " + name);
		System.out.println("Dia chi cua sinh vien: " + diaChi);
		System.out.println("So dien thoai cua sinh vien: " + soDienThoai);
	}
}
