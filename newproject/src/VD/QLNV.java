package VD;

import java.util.ArrayList;
import java.util.Scanner;

public class QLNV {
	ArrayList<CongTy> list = new ArrayList<CongTy>();
	Scanner input = new Scanner(System.in);
	int tp , tv;
	
	public void nhapTTNV() {
		System.out.print("Nhập số lượng trưởng phòng");
		tp = input.nextInt();
		System.out.print("Nhập sô lượng tiếp viên");
		tv = input.nextInt();
		for(int i = 1; i <= tp; i++) {
			System.out.printf("Nhập  trưởng phòng thứ %d\n",i);
			CongTy c = new CongTy();
			c.nhapTTCB();
			c.luongTrachNhiem();
			list.add(c);
		}
		for(int i = 1; i <= tv; i++) {
			System.out.printf("Nhập  tiếp viên thứ %d\n",i);
			CongTy c = new CongTy();
			c.nhapTTCB();
			c.hoaHong();
			list.add(c);
		}
	}
	public void xuatTTNV() {
		for (CongTy s : list) {
			s.xuatTTCB();
		}
	}
}
