package javacorn;
import java.util.Scanner;
public final class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		// nhập số phần tử của mảng
		int n;
		System.out.print("Enter the number of elements in the array: ");
		n = input.nextInt();
		//Nhập các phần tử của mảng
		int a[] = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = input.nextInt();
		}
		// In mảng vừa nhập ra
		System.out.print("Arr: ");
		printArr(a);
		// hoán đợi giá trị nếu phần tử trước lơns hơn phần tử sau
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.print("New arr: ");
		printArr(a);
	}
	// Hàm in mảng
	public static void printArr(int[] x) {
		for(int i = 0; i < x.length; i++) {
			System.out.print(x[i] +" ");
		}
		System.out.println();
	}

}
