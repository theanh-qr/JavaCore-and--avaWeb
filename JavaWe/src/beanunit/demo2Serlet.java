package beanunit;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

/**
 * Servlet implementation class demo2Serlet
 */
@WebServlet("/demo2Serlet")
public class demo2Serlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public demo2Serlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("/demo/demo2Beanunit.jsp");
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
			SimpleBean bean = new SimpleBean();
			BeanUtils.populate(bean, request.getParameterMap());
			response.getWriter().println("<h1>" +bean.getFullname()+"<h1>");
			response.getWriter().println("<h1>" +bean.getAge()+"<h1>");
			response.getWriter().println("<h1>" +bean.getCountry()+"<h1>");
			response.getWriter().println("<h1>" +bean.getSalary()+"<h1>");	
		}catch( Exception e){
			
		}
	}

}
