package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Product;

/**
 * Servlet implementation class BookstoreServlet
 */
@WebServlet("/BookstoreServlet")
public class BookstoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	public static ArrayList<Product> list = new ArrayList<Product>();
	
    public BookstoreServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("<title>Bookstore</title>");
		out.print("</head>");
		
		out.print("<body>");
		out.print("<h1>Bookstore</h1>");
		
		out.print("<table>");
		
		for(Product x : list) {
			out.print("<tr>");
			out.print("<td style='border: 1px solid black'>Book title: " + x.getTitle() + "<br>" + "Price: " + x.getPrice() + "</td>");
			out.print("<td style='border: 1px solid black'>Details</td>");
			out.print("</tr>");
		}
		
		out.print("</table>");
		
		out.print("</body>");
		out.print("</html>");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	public void init() {
		list.add(new Product("Book 1", 2.5));
		list.add(new Product("Book 2", 3.02));
		list.add(new Product("Book 3", 2.75));
		list.add(new Product("Book 4", 1.5));
		list.add(new Product("Book 5", 1.2));
	}
	
}
