package Phan1;

import java.util.Scanner;

public class TinhTongChanLe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n,i;
		System.out.println("Bạn sẽ nhập vào 1 số để tính tổng các số chắn hoặc lẻ từ 0 đến số đó: ");
		System.out.println("Nhập số bạn muốn: ");
		n = input.nextInt();
		int sum = 0;
		if(n%2 == 0) {
			i = 2;
		}else {
			i = 1;
		}
		for(; i <= n; i+=2) {
			sum += i;
		}
		System.out.print("Kết quả là: "+sum);
	}

}
