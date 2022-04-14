package lab2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Dangky
 */
@WebServlet("/Dangky")
public class Dangky extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Dangky() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("/view/Dangky.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("/view/Thongtindk.jsp");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String sex = request.getParameter("sex");
		String check = request.getParameter("check");
		String nationality = request.getParameter("nationality");
		String message = request.getParameter("message");
		String favorite1 = request.getParameter("favorite1");
		String favorite2 = request.getParameter("favorite2");
		String favorite3 = request.getParameter("favorite3");
		String favorite4 = request.getParameter("favorite4");
		
		
		request.setAttribute("username", username);
		request.setAttribute("password", password);
		request.setAttribute("sex", sex);
		if(check == null) {
			request.setAttribute("check","No");
		}else {
		request.setAttribute("check", check);
		}
		request.setAttribute("nationality", nationality);
		request.setAttribute("message", message);
		if(favorite1 == null) {
			request.setAttribute("favorite1"," ");
		}else {
			request.setAttribute("favorite1", favorite1);
		}
		
		if(favorite1 == null) {
			request.setAttribute("favorite2"," ");
		}else {
			request.setAttribute("favorite2", favorite2);
		}
		
		if(favorite1 == null) {
			request.setAttribute("favorite3"," ");
		}else {
			request.setAttribute("favorite3", favorite3);
		}
		
		if(favorite1 == null) {
			request.setAttribute("favorite4"," ");
		}else {
			request.setAttribute("favorite4", favorite4);
		}
		rd.forward(request, response);
		
	}

}
