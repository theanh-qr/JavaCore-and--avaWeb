package lab3;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = CookieUtils.get("username", request);
		if(username != null && !username.equals("")) {
			request.setAttribute("message", "Login successfully");
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			return;
		}
		RequestDispatcher rd = request.getRequestDispatcher("/demo/login.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			LoginUser user = new LoginUser();
			BeanUtils.populate(user, request.getParameterMap());
			if(user.getUsername().equals("admin") && user.getPassword().equals("admin")) {
				HttpSession session = request.getSession();
				session.setAttribute("username", user.getUsername());
				request.setAttribute("message", "Login Successfully");
				if(user.isRemember()) {
					CookieUtils.add("username", user.getUsername(), 2, response);
				}else {
					CookieUtils.add("username", user.getUsername(), 0, response);
				}
			}else {
				request.setAttribute("message", "Inalid username or password");
			}
		}catch(Exception E) {
			
		}
		RequestDispatcher rd = request.getRequestDispatcher("/demo/login.jsp");
		rd.forward(request, response);
	}

}
