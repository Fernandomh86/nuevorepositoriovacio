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
			response.sendRedirect("login.jsp");//servlet attach to login.jsp
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			User loginUser = new User();
			loginUser.setEmail(request.getParameter("email"));//gets a parameter from form input email when submit
			loginUser.setPassword(request.getParameter("password"));//gets a parameter from form input password when submit
			
			boolean error=false;
			
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
			bibiana.setEmail("bibiana4@hotmail.com");
			bibiana.setPassword("bibiana4");
			
			User rodrigo = new User();
			rodrigo.setEmail("rodrigo5@hotmail.com");
			rodrigo.setPassword("rodrigo5");
			
			User[] userArray = {fernando, daniel, joseManuel, bibiana, rodrigo};
			HttpSession mysession = (HttpSession)request.getSession(); // inits session on user_home
			
			
			for (int i = 0; i < userArray.length; i++)
			if (loginUser.getEmail() == userArray[i].getEmail() && loginUser.getPassword() == userArray[i].getPassword()) {
				//if input email & password = userArray email & password, go to user_home, else redirects again to login.jsp + error msg
			 // inits session on user_home
				request.getRequestDispatcher("user_home.jsp").forward(request, response); // send us to user_home.jsp
				response.sendRedirect("/homeServlet"); // change ServletLogin to homeServlet
				mysession.removeAttribute("error"); //only if you failed to put correct email & password
				mysession.setAttribute ("identified _user", userArray[i]);
				break;
			} else {
				error = true;
			}
			if (error == true) {
			request.getRequestDispatcher("login.jsp").forward(request, response); //redirects again to login.jsp
			mysession.setAttribute("error", "We didn't find the introduced data in our database, please retry again.");
					//Set a map with key "error" and its value, the error msg
			}
		}
	}