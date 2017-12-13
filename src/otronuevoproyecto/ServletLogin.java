package otronuevoproyecto;

	import java.io.IOException;
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

//		/**
//		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//		 */
//		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//			response.sendRedirect("login.jsp");
//		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			User loginUser = new User();
			loginUser.setEmail(request.getParameter("email"));
			loginUser.setPassword(request.getParameter("password"));
			
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
			
			HttpSession session = request.getSession();
			
			for (int i = 0; i < userArray.length; i++)
			if (loginUser.getEmail() == userArray[i].getEmail() && loginUser.getPassword() == userArray[i].getPassword()) {
				request.getRequestDispatcher("home_usuario.jsp").forward(request, response);
				request.setAttribute("inUser", userArray[i]); //set attributes for the next 
				HttpSession mysession = (HttpSession)request.getSession();
				response.sendRedirect("/homeServlet");
			} else {
				request.getRequestDispatcher("login.jsp").forward(request, response);
				
			}
		}
	}