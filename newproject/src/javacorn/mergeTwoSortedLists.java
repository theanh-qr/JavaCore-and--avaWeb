/**
 * 
 */
package javacorn;
import java.util.Scanner;
import java.util.Arrays;
/**
 * @author THE ANH
 *
 */
public class mergeTwoSortedLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		// nhập số phần tử của mảng 1
		int n;
		System.out.print("Enter the number of elements in the array 1: ");
		n = input.nextInt();
		//Nhập các phần tử của mảng 1
		int a[] = new int[n];
		System.out.println("Enter the value of array 1: ");
		for(int i = 0; i < n; i++) {
			a[i] = input.nextInt();
		}
		// nhập số phần tử của mảng 2
		int m;
		System.out.print("Enter the number of elements in the array 2: ");
		m = input.nextInt();
		// Nhập các phần tử của mảng 2
		int b[] = new int[m];
		System.out.println("Enter the value of array 2: ");
		for (int i = 0; i < m; i++) {
			b[i] = input.nextInt();
		}
		
		//In 2 mang ra
		System.out.print("Array 1: ");
		printArr(a);
		System.out.print("Array 2: ");
		printArr(b);
		
		//Công độ dài 2 mảng và tạo mảng gộp của 2 mảng trên
		int d = n + m;
		int newarr[] = new int[d];
		int pos = 0;
		//Sử dụng vòng lặp for để lưu 2 mảng
			//Lưu của mảng 1
		for( int element : a) {
			newarr[pos] = element;
			pos++;
		}
		//Lưu của mảng 2
		for( int element : b) {
			newarr[pos] = element;
			pos++;
		}
		//Sắp xếp phần tử của mảng
		for (int i = 0; i < newarr.length; i++) {
			for (int j = 0; j < newarr.length - 1 - i; j++) {
				if (newarr[j] > newarr[j+1]) {
					int temp = newarr[j];
					newarr[j] = newarr[j+1];
					newarr[j+1] = temp;
				}
			}
		}
		System.out.print("New arr: ");
		printArr(newarr);
	}
	
	// Hàm in mảng
	public static void printArr(int[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
	}

}
