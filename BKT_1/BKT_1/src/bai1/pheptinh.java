package bai1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class pheptinh
 */
@WebServlet("/pheptinh")
public class pheptinh extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public pheptinh() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		javax.servlet.RequestDispatcher rd=request.getRequestDispatcher("/bai1/formtinh.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		double kq;
		double a = Double.parseDouble(request.getParameter("soa"));
		double b = Double.parseDouble(request.getParameter("sob"));
		double c = Double.parseDouble(request.getParameter("soc"));
		String pheptinh = request.getParameter("tinh");
		switch (pheptinh) {
		case "+": {
			kq = a+b+c;break;
			
		}
		case "-": {
			kq = a-b-c;break;
			
		}
		case "*": {
			kq = a*b*c;break;
			
		}
		case "/": {
			kq = a/b/c;break;
			
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + pheptinh);
		}
		javax.servlet.RequestDispatcher rd=request.getRequestDispatcher("/bai1/result.jsp");
		
		request.setAttribute("kq", "ket qua " + (int) kq);
		rd.forward(request, response);
	}
	}

