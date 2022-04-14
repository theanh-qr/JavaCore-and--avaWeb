package bai2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;
import org.apache.commons.beanutils.converters.DateTimeConverter;

import beanunit.MultipartConfig;
import beanunit.RequestDispatcher;
import beanunit.nhanvien2;

/**
 * Servlet implementation class nhanvien
 */
@MultipartConfig
@WebServlet("/nhanvien")
public class nhanvien extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public nhanvien() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd=request.getRequestDispatcher("/bai2/nhanvien.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			request.setCharacterEncoding("utf-8");
			response.setContentType("text/html;charset=UTF-8");
			DateTimeConverter dtc = new DateConverter(new Date());
			dtc.setPattern("dd/mm/yyyy");
			ConvertUtils.register(dtc, Date.class);
			nhanvien2 bean = new nhanvien2();
			BeanUtils.populate(bean, request.getParameterMap());
			
			Part filepart = request.getPart("file");
			String realPath=request.getServletContext().getRealPath("images/");//lay duong dan thuc
			String filename = Path.of(filepart.getSubmittedFileName()).getFileName().toString();//lay ten file upload
			if(!Files.exists(Path.of(realPath))) {
				Files.createDirectories(Path.of(realPath));
			}
			filepart.write(realPath+"/"+ filename);

			request.setAttribute("BEAN", bean);
			response.getWriter().print("<h1>"+bean.getUser()+"</h1>");
			response.getWriter().println("<img src='images/"+filename+"' width='300' height='300'>");
			response.getWriter().print("<h1>"+bean.getBirth()+"</h1>");
			response.getWriter().print("<h1>"+bean.getCountry()+"</h1>");
			response.getWriter().print("<h1>"+bean.isSex()+"</h1>");
			response.getWriter().print("<h1>"+bean.isFamily()+"</h1>");
			response.getWriter().print("<h1>"+bean.getNote()+"</h1>");
			for(String st:bean.getHobby()) {
				response.getWriter().print("<h1>"+ st + ","+"</h1>");
		}
		} catch(Exception e) {}
	}

}
