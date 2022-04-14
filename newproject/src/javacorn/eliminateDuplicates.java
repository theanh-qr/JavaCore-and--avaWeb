package javacorn;
import java.util.Arrays;
import java.util.Scanner;
public class eliminateDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		// nhập số phần tử của mảng
		int n;
		System.out.print("Enter the number of elements in the array: ");
		n = input.nextInt();
		
		// Nhập các phần tử của mảng 
		int a[] = new int[n];
		System.out.println("Enter the value of array: ");
		for (int i = 0; i < n; i++) {
			a[i] = input.nextInt();
		}
		
		// Tạo mảng mới
		int b[] = new int[n];
		int bSize = 0;
		boolean isExit = false;
		//Gắn giá trị k trung lặp vào mảng
		for (int i = 0; i < n; i++) {
			isExit = false;
			for(int j = 0; j < n-1; j++) {
				if(a[i] == b[j]) {
					isExit = true;
					break;
				}
			}
			if(!isExit) {
				b[bSize++] = a[i];
			}
		}
		Arrays.sort(b);
		System.out.print("New Array: ");
		System.out.print(Arrays.toString(b));
	}

}
