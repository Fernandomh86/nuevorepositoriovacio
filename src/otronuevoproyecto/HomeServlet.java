package otronuevoproyecto;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


	/**
	 * Servlet implementation class LoginServlet
	 */
	@WebServlet("/user_home")
	public class HomeServlet extends HttpServlet {
		private static final long serialVersionUID = 1L;
	       
	    /**
	     * @see HttpServlet#HttpServlet()
	     */
	    public HomeServlet() {
	        super();
	    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		 User loginUser = new User();
         loginUser.setId(request.getParameter("id"));
		 loginUser.setEmail(request.getParameter("email"));//gets a parameter from form input email when submit
         loginUser.setPassword(request.getParameter("password"));//gets a parameter from form input password when submit
		

	}



}
