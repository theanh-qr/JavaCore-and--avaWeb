package abstracts;

import java.util.Scanner;

public class MainTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Nhập 3 cạnh: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side3 + side2 > side1)) {

			System.out.print("Nhập màu: ");
			String color = input.next();

			System.out.print("Vẽ kín hình chưa (true / false)? ");
			boolean filled = input.nextBoolean();

			Triangle triangle = new Triangle(side1, side2, side3);
			System.out.println("Các cạnh của tam giác là: " + triangle.toString());
			System.out.println("Tính chu vi: " + triangle.getPerimeter());
			System.out.println("Tính diện tích: " + triangle.getArea());
			System.out.println("Màu của hình là: " + color);
			if (filled == true) {
				System.out.println("Tam giác đã đc vẽ kín");
			} else {
				System.out.println("Tam giác chưa đc vẽ kín");
			}
		} else {

			System.out.println("Đây không là 3 cạch của 1 tam giác");

		}

	}

}
