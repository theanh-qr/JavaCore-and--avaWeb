package lap1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


/**
 * Servlet implementation class uploadfile
 */
@MultipartConfig
//@MultipartConfig(maxFileSize = 1024*10,maxRequestSize = 1024*50)
@WebServlet("/uploadfile")
public class uploadfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public uploadfile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("/view/uploadfile.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String fullname = request.getParameter("fullname");
			Part part = request.getPart("photo");
			String realPath = request.getServletContext().getRealPath("images/");
			String fileName = Path.of(part.getSubmittedFileName()).getFileName().toString();
			if(!Files.exists(Path.of(realPath))) {
				Files.createDirectory(Path.of(realPath));
			}
			part.write(realPath+"/"+fileName);
			response.getWriter().println("<h1>Full name: "+ fullname+"<h1>");
			response.getWriter().println("<img src='images/"+ fileName +"' width='100' height='100'>");
		}catch(Exception e) {
			
		}
	}

}
