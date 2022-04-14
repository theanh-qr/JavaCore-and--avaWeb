package javacorn;

import java.util.Scanner;

public class Algebra {

	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a, b, c, d, e, and f
		System.out.print("Enter a, b, c, d, e, f: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();

		// Create a LinearEquation object
		LinearEquation linearEquation = new LinearEquation(a, b, c, d, e, f);

		// Display results
		if (linearEquation.isSolvable()) {
			System.out.println("x is " + linearEquation.getX() + " and y is " + linearEquation.getY());
		} else
			System.out.println("The equation has no solution.");
	}

	/*
	 * (Đại số: 2 * 2 phương trình tuyến tính) Thiết kế một lớp có tên
	 * LinearEquation cho một * Hệ phương trình tuyến tính 2 * 2: * * ax + by = e,
	 * cx + dy = f; x = (ed - bf) / (ad - bc) y = (af - ec) / (ad - bc) * * Lớp
	 * chứa: * ■ Các trường dữ liệu riêng a, b, c, d, e và f. * ■ Một hàm tạo với
	 * các đối số cho a, b, c, d, e và f. * ■ Sáu phương thức getter cho a, b, c, d,
	 * e và f. * ■ Một phương thức có tên isSolvable () trả về true nếu ad - bc
	 * không phải là 0. * ■ Phương thức getX () và getY () trả về nghiệm của phương
	 * trình. * * Vẽ biểu đồ UML cho lớp và sau đó thực hiện lớp. Viết bài kiểm tra
	 * * chương trình nhắc người dùng nhập a, b, c, d, e và f và hiển thị dấu * kết
	 * quả. Nếu ad - bc bằng 0, báo cáo rằng "Phương trình không có nghiệm". Nhìn
	 * thấy * Lập trình Bài tập 3.3 cho các lần chạy mẫu.
	 **/

}
