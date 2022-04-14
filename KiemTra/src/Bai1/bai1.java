package Bai1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class bai1
 */
@WebServlet("/bai1")
public class bai1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public bai1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("/views/bai1.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("/views/ketquabai1.jsp");
		double a=Double.parseDouble(request.getParameter("soa"));
		double b=Double.parseDouble(request.getParameter("sob"));
		double c=Double.parseDouble(request.getParameter("soc"));
		double kq;
		String pheptinh=request.getParameter("tinh");
		switch(pheptinh) {
		case "+" :{
			kq = a + b + c;
			break;
		}
		case "-" :{
			kq = a - b - c;
			break;
		}
		case "*" :{
			kq = a * b * c;
			break;
		}
		case "/" :{
			kq = a / b / c;
			break;
		}
		default:
			throw new IllegalArgumentException("Unexprcted value" + pheptinh);
		}
		request.setAttribute("result", kq);
		rd.forward(request, response);
	}

}
