package lab2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class hinhtamgiac
 */
@WebServlet({"/hinhtamgiac/dientich","/hinhtamgiac/chuvi"})
public class hinhtamgiac extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public hinhtamgiac() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("/view/hinhtamgiac.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("/view/hinhtamgiac.jsp");
		String uri = request.getRequestURI();
		double a= Double.parseDouble(request.getParameter("a"));
		double b= Double.parseDouble(request.getParameter("b"));
		double c= Double.parseDouble(request.getParameter("c"));
		double cv = (a+b+c);
		if((a+b)>c && (b+c)>a && (a+c)>b) {
			if(uri.contains("dientich")) {
				double dt = Math.sqrt(cv*(a+b-c)*(a+c-b)*(b+c-a))/4;
				request.setAttribute("kq", "dien tich tam giac" + dt);
			}else {
				request.setAttribute("kq", "chu vi tam giac" + cv);
			}
		}else {
			request.setAttribute("kq", "Khong thoa man cac canh cua tam giac");
		}
		rd.forward(request, response);
	}

}
