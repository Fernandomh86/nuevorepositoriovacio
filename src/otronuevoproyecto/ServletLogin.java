package otronuevoproyecto;

	import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
	import otronuevoproyecto.User;

	/**
	 * Servlet implementation class LoginServlet
	 */
	@WebServlet("/login")
	public class ServletLogin extends HttpServlet {
		private static final long serialVersionUID = 1L;
	       
	    /**
	     * @see HttpServlet#HttpServlet()
	     */
	    public ServletLogin() {
	        super();
	    }

		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.sendRedirect("login.jsp");//shows login.jsp
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			User loginUser = new User();
			loginUser.setEmail(request.getParameter("email"));//gets a parameter from form input email when submit
			loginUser.setPassword(request.getParameter("password"));//gets a parameter from form input password when submit
			
			User fernando = new User();
			fernando.setEmail("fernando1@hotmail.com");
			fernando.setPassword("fernando1");
			
			User daniel = new User();
			daniel.setEmail("daniel2@hotmail.com");
			daniel.setPassword("daniel2");
			
			User joseManuel = new User();
			joseManuel.setEmail("josemanuel3@hotmail.com");
			joseManuel.setPassword("josemanuel3");
			
			User bibiana = new User();
			fernando.setEmail("bibiana4@hotmail.com");
			fernando.setPassword("bibiana4");
			
			User rodrigo = new User();
			rodrigo.setEmail("rodrigo5@hotmail.com");
			rodrigo.setPassword("rodrigo5");
			
			User[] userArray = {fernando, daniel, joseManuel, bibiana, rodrigo};
			
			
			for (int i = 0; i < userArray.length; i++)
			if (loginUser.getEmail() == userArray[i].getEmail() && loginUser.getPassword() == userArray[i].getPassword()) {
				//if input email & password = userArray email & password, go to user_home, else redirects again to login.jsp + error msg
				HttpSession mysession = (HttpSession)request.getSession(); // inits session on user_home
				request.getRequestDispatcher("user_home.jsp").forward(request, response); // send us to user_home.jsp
				request.setAttribute("inUser", userArray[i]); //set attributes for the user welcome on user_home
				response.sendRedirect("/homeServlet"); // change ServletLogin to homeServlet
				break;
			} else {
				request.getRequestDispatcher("login.jsp").forward(request, response); //redirects again to login.jsp
						response.setContentType("text/html");//we are saying that the next println is text for html
					    PrintWriter out = response.getWriter(); //instance the method getWriter of response to "out"
					    out.println("<font face=\"verdana\" color=\"red\">We didn't find the introduced data in our database, please retry.</font>"); 
					    //"out" has a method (println) to show us a msg
				break;
			}
		}
	}