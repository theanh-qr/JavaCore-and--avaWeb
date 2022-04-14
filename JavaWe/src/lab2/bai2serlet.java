package lab2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.beanutils.BeanUtils;

import beanunit.SimpleBean;

/**
 * Servlet implementation class bai2serlet
 */
@WebServlet("/bai2serlet")
public class bai2serlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public bai2serlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("/views/lab2/bai2.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			request.setCharacterEncoding("utf-8");
			response.setContentType("text/html; charset=UTF-8");
			Staff staff = new Staff();
			BeanUtils.populate(staff, request.getParameterMap());
			response.getWriter().println("<h1>" +staff.getUsername()+"<h1>");
			response.getWriter().println("<h1>" +staff.getBirthday()+"<h1>");
			response.getWriter().println("<h1>" +staff.getCheck()+"<h1>");
			response.getWriter().println("<h1>" +staff.getNationality()+"<h1>");
			response.getWriter().println("<h1>" +staff.getMessage()+"<h1>");
			for(String st : staff.getHobby())
			{
				response.getWriter().println("<h1>" +st+ ","+"<h1>");
			}
		}catch( Exception e){
			
		}
	}

}
