package KT;

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
 * Servlet implementation class Bai1
 */
@WebServlet("/Bai1")
@MultipartConfig
public class Bai1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Bai1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("/views/KT/bai1.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String date = request.getParameter("date");
		String favorite1 = request.getParameter("favorite1");
		String favorite2 = request.getParameter("favorite2");
		String favorite3 = request.getParameter("favorite3");
		String favorite4 = request.getParameter("favorite4");
		
		request.setAttribute("date", date);
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
		try {
			Part filePath =request.getPart("photo");
			String realPath=request.getServletContext().getRealPath("images/");
			if(!Files.exists(Path.of(realPath))) {
				Files.createDirectories(Path.of(realPath));
			}
			String filename=Path.of(filePath.getSubmittedFileName()).getFileName().toString();
			filePath.write(realPath+"/"+ filename);
			
			request.setAttribute("img", filename);

		}catch(Exception e) {
			
		}
		RequestDispatcher rd=request.getRequestDispatcher("/views/KT/kqbai1.jsp");
		rd.forward(request, response);
	}

}
