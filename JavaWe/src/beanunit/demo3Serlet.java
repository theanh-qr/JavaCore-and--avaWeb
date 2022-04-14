package beanunit;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;

import org.apache.commons.beanutils.converters.DateConverter;
import org.apache.commons.beanutils.converters.DateTimeConverter;

/**
 * Servlet implementation class demo3Serlet
 */
@WebServlet("/demo3Serlet")
public class demo3Serlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public demo3Serlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("/demo/demo3Beanunit.jsp");
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
			DateTimeConverter dtc = new DateConverter(new Date(0));
			dtc.setPattern("dd/MM/yyyy");
			ConvertUtils.register(dtc, Date.class);
			
			
			
			AdvanceBean bean = new AdvanceBean();
			BeanUtils.populate(bean, request.getParameterMap());
			
			Part part = request.getPart("photofile");
			String realPath = request.getServletContext().getRealPath("images/");
			String filename=Path.of(part.getSubmittedFileName()).getFileName().toString();
			if(!Files.exists(Path.of(realPath))) {
				Files.createDirectories(Path.of(realPath));
			}
			part.write(realPath+"/"+ filename);
			request.setAttribute("BEAN", bean);
			response.getWriter().println("<h1>" + bean.getRecuiltDate()+"<h1>");
			for(String st : bean.getHobby())
			{
				response.getWriter().println("<h1>" +st+ ","+"<h1>");
			}
			response.getWriter().println("<img src='images/'"+filename+"' width = '100' height ='100'>");
		}catch( Exception e){
			
		}
	}

}
