package control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.DAO;
import entity.Banner;
import entity.Category;
import entity.Product;


@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Home() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		response.setContentType("text/html;charset=UTF-8");
		DAO dao = new DAO();
		List<Product> list = dao.getAllProduct();
		List<Category> listCategory = dao.getAllCategory();
		List<Banner> listBanner = dao.getAllBanner();

		

		
		request.setAttribute("listProduct", list);
		request.setAttribute("listCategory", listCategory);
		request.setAttribute("listBanner", listBanner);
		request.getRequestDispatcher("Home.jsp").forward(request, response);
	}

}
