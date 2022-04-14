package javacorn;
import java.util.Scanner;

public class sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//Nhập số phânf tử của mảng
		int n;
		System.out.print("Enter the number of elements in the array: ");
		n = input.nextInt();
		//Nhập mảng
		int a[] = new int[n];
		System.out.println("Enter the value of array: ");
		for(int i =  0; i < n; i++) {
			a[i] = input.nextInt();
		}
		//In mảng vừa nhập
		printArr(a);
		//So sánh các phần tử xem đã đc sắp xếp theo thứ tự tăng dần chưa
		for (int j = 0; j < a.length; j++) {
			if (a[j] > a[j + 1]) {
				System.out.print("False");
				break;
			} else {
				System.out.print("True");
				break;
			}
		}
	}
	
	// Hàm in mảng
	public static void printArr(int[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
	}

}
