package KT;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SinhvienServlet
 */
@WebServlet("/SinhvienServlet")
public class SinhvienServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SinhvienServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		Sinhvien sinhvien = new Sinhvien("03","1235847","26536425","theanh@gmail.com","LeDucTon","");
//		SinhvienDAO dao = new SinhvienDAO();
//		dao.insert(sinhvien);
		
		 //update
//		 Sinhvien sinhvien = new Sinhvien("03","1235847","2653642533","theanh@gmailrrr2.com","LeDucTon22","s2");
//		 SinhvienDAO dao = new SinhvienDAO();
//		dao.update(sinhvien);
		// tim theo id
//		SinhvienDAO dao = new SinhvienDAO();
//		System.out.println("Tìm kiếm thông tin");
//		System.out.println("Thông tin: "+dao.tkId("01"));

		// tim kiem tat ca
		SinhvienDAO dao = new SinhvienDAO();
		List <Sinhvien> list = dao.tkAll();
		for(Sinhvien sinhvien: list) {
			System.out.println("Thông tin:>>" + sinhvien.toString());
		}
		// check thong tin ham1
//		UserDAO dao = new UserDAO();
//		System.out.println("Check login ham 1");
//		if(dao.checkLogin("s1","123@" )) {
//			System.out.println("Dang nhap thanh cong");
//		}else {
//			System.out.println("Dang nhap that bai");
//		}

		// check thong tin ham2
//		UserDAO dao = new UserDAO();
//		System.out.println("Check login ham 2");
//		if (dao.checkLogin1("s1", "123@")) {
//			System.out.println("Dang nhap thanh cong");
//		} else {
//			System.out.println("Dang nhap that bai");
//		}
		
		//tim theo ten
//		UserDAO dao = new UserDAO();
//		List<User> lst = dao.tktheoten("Anh");
//		for(User user: lst) {
//			System.out.println("thông tin:>>" +user.toString());
//		}
		//Xoa
//		UserDAO dao = new UserDAO();
//		List <User> lst = dao.tkAll();
//		dao.delete("s1");
//		for(User user: lst) {
//			System.out.println("thông tin:>>" +user.toString());
//		}
		
	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
