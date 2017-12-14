package otronuevoproyecto;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class taskServlet
 */
@WebServlet("/taskServlet")
public class taskServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public taskServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		

		 Task taskMother = new Task();
	     taskMother.setDescription(request.getParameter("description"));
	     taskMother.setName(request.getParameter("name"));
	     taskMother.setNotes(request.getParameter("notes"));
	     taskMother.setInitialDate(request.getParameter("initialDate"));
	     taskMother.setEndDate(request.getParameter("endDate"));
	     taskMother.setUsername(request.getParameter("userName"));
	     
	     HttpSession mysession = (HttpSession)request.getSession(); // inits session on user_home
			request.getRequestDispatcher("user_home.jsp").forward(request, response); // send us to user_home.jsp
			request.setAttribute("newTask", taskMother); //set attributes for the new task
			response.sendRedirect("/homeServlet"); // change taskServlet to homeServlet
			
//		mysession.getAttribute();//PUT IN HOMESERVLET!!!!!!!!!!!!!!!

	}
}
