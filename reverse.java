package sami.alabed.cse640.HW1.Q2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class reverse
 */
@WebServlet("/reverse")
public class reverse extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public reverse() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//define url and get input parameter
		String url = "/Q2/outputForm.jsp";
		String string = request.getParameter("string");
		
		//reverse the string and set it to a new attribute called in output jsp
		StringBuilder string1 = new StringBuilder(string);
		string1.reverse();
		System.out.println(string1);
		request.setAttribute("string", string1);
		
		ServletContext context = getServletContext();
		RequestDispatcher dispatcher = context.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
