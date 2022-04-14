package Phan1;
import java.util.Scanner;

public class TamGiacSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int h;
		int x, output;
		h = input.nextInt();
		for (int i = 1; i <= h; i++) {
			for (int j = 0; j <= 2 * h; j++) {
				x = j - h;
				if (x < 0) {
					x *= -1;
				}
				output = i - x;
				if (output > 0) {
					System.out.printf("%3d", output);
				} else {
					System.out.printf("   ");
				}
			}

		}
	}
}
