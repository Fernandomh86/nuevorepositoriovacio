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
    	
    }
        // TODO Auto-generated method stub
    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        
         Task newTask = new Task();
         newTask.setName(request.getParameter("name"));
         newTask.setDescription(request.getParameter("description"));
         newTask.setNotes(request.getParameter("notes"));
         newTask.setInitialDate(request.getParameter("initialDate"));
         newTask.setEndDate(request.getParameter("endDate"));
         //newTask.setResponsable(request.getParameter("responsable"));

            request.getRequestDispatcher("user_home.jsp").forward(request, response); // send us to user_home.jsp
            request.setAttribute("newTaskName", newTask.getName()); //set attributes for the new task
            request.setAttribute("newTaskInitialDate", newTask.getInitialDate());
            request.setAttribute("newTaskEndDate", newTask.getEndDate());
            response.sendRedirect("/homeServlet"); // change taskServlet to homeServlet
            
//        mysession.getAttribute();//PUT IN HOMESERVLET!!!!!!!!!!!!!!!
            
    }
}
 