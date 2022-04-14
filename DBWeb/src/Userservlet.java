
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import model.User;
import model.UserD;
/**
 * Servlet implementation class Userservlet
 */
@WebServlet("/Userservlet")
public class Userservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Userservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			User user=new User("s3","Phuong@","Hoang Phuong","Phuong19821@gmail.com",true);
			UserD D=new UserD();
			D.insert(user);
//			User user=new User("s3","Phuong@","Hoang Phuong","Phuong19821@gmail.com",true);
//			UserD D=new UserD();
//			D.update(user);
//			UserD D=new UserD();
//	    	System.out.println("tim kiem thong tin");
//	    	System.out.println("thong tin: "+ D.tkId("s1"));
//			UserD D=new UserD();
//			List<User> list=D.tkAll();
//			for(User user:list) {
//			System.out.println("tt:>>" +user.toString());
			
			UserD dao=new UserD() ;
//			System.out.println( "Check login ham 1");
//			if (dao.checkLogin("s4", "231@")) {
//				System.out.println( "Dang nhap thanh cong");
//			}
//			else {
//				System.out.println( "Dang nhap khong thanh cong");
//			}

			// check thong tin 
			System.out.println( "Check login ham 2");
			if (dao.checkLogin1("s4", "231@")) {
				System.out.println( "Dang nhap thanh cong");
			}
			else {
				System.out.println( "Dang nhap khong thanh cong");
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
