package otronuevoproyecto;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class homeServlet
 */
@WebServlet("/homeServlet")
public class homeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public homeServlet() {
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
	     user bibi = new user();
	     bibi.setId("id01");
	     bibi.setEmail("bibi@banana.com");
	     bibi.setPassword("1234");
	        
	     user jose = new user();
	     bibi.setId("id02");
	     bibi.setEmail("jose@banana.com");
	     bibi.setPassword("laquegustes");
	     
	     user rodri = new user();
	     bibi.setId("id03");
	     bibi.setEmail("rodri@banana.com");
	     bibi.setPassword("hola123");
	     
	     user fernando = new user();
	     bibi.setId("id04");
	     bibi.setEmail("fernando@banana.com");
	     bibi.setPassword("faltadani");
	            
	     user[] userArray = {bibi, jose, rodri, fernando};
	     
	     task task1 = new task();
	     task1.setDescription("descripcion1");
	     task1.setName("name1");
	     task1.setNotes("notes1");
	     task1.setInitialDate("10_01_2018");
	     task1.setEndDate("30_01_2018");
	     task1.setUsername(bibi.getId());
	     
	     task task2 = new task();
	     task1.setDescription("descripcion2");
	     task1.setName("name2");
	     task1.setNotes("notes2");
	     task1.setInitialDate("10_01_2018");
	     task1.setEndDate("30_01_2018");
	     task1.setUsername(rodri.getId());
	     
	     task task3 = new task();
	     task1.setDescription("descripcion3");
	     task1.setName("name3");
	     task1.setNotes("notes3");
	     task1.setInitialDate("10_01_2018");
	     task1.setEndDate("30_01_2018");
	     task1.setUsername(jose.getId());
	     
	     task[] taskArray = {task1,task2,task3};
	        
//        request.setAttribute("testParam", "DESDE EL SERVLET");        
//        request.setAttribute("userArray", userArray);    
//        request.getRequestDispatcher("login.jsp").forward(request, response);
	}

}
