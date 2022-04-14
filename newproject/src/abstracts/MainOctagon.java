package abstracts;
import java.util.Scanner;
public class MainOctagon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Nhập cạnh của bát giác đều: ");
		double n = input.nextDouble();
		
		Octagon o = new Octagon(n);
		System.out.println("Chu vi la: " + o.getPerimeter());
		System.out.println("Dien tích la: " + o.getArea());
	}

}
