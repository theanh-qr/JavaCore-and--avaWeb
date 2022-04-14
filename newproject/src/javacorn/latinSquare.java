package javacorn;
import java.util.Scanner;
public class latinSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int n;
		System.out.print("Enter number n: ");
		n = input.nextInt();
		System.out.println("Enter" + n + "rows of letters separated by spaces: ");
		
		char x[][] = new char[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				x[i][j] = input.next().charAt(0);
			}
		}
	}

}
