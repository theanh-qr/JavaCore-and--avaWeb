package lab2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class maytinh
 */
@WebServlet("/maytinh")
public class maytinh extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public maytinh() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("/view/Tinh.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("/view/ketqua.jsp");
		double a=Double.parseDouble(request.getParameter("soa"));
		double b=Double.parseDouble(request.getParameter("sob"));
		double kq;
		String pheptinh=request.getParameter("tinh");
		switch(pheptinh) {
		case "+" :{
			kq = a + b;
			break;
		}
		case "-" :{
			kq = a - b;
			break;
		}
		case "*" :{
			kq = a * b;
			break;
		}
		case "/" :{
			kq = a / b;
			break;
		}
		default:
			throw new IllegalArgumentException("Unexprcted value" + pheptinh);
		}
		request.setAttribute("result", kq);
		rd.forward(request, response);
	}

}
