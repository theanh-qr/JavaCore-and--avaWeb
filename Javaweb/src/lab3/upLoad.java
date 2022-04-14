package lab3;

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
 * Servlet implementation class upLoad
 */
@MultipartConfig
@WebServlet("/upLoad")
public class upLoad extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public upLoad() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("/view/upLoad.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			Part filePath =request.getPart("photo");
			Part docPath =request.getPart("docfile");
			String realPath=request.getServletContext().getRealPath("images/");
	
			if(!Files.exists(Path.of(realPath))) {
				Files.createDirectories(Path.of(realPath));
			}
			String filename=Path.of(filePath.getSubmittedFileName()).getFileName().toString();
			String docfilename=Path.of(docPath.getSubmittedFileName()).getFileName().toString();
			
			filePath.write(realPath+"/"+ filename);
			docPath.write(realPath+"/"+ docfilename);
			
			request.setAttribute("img", filename);
			request.setAttribute("doc", docfilename);
			
			RequestDispatcher rd=request.getRequestDispatcher("/view/ketQuaUpLoad.jsp");
			rd.forward(request, response);
		}catch (Exception e){	
			
		}
	}

}
