package Controlleur;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AuthentServlet
 */
@WebServlet("/AuthentServlet")
public class AuthentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthentServlet() {
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
		  String prenom = request.getParameter("prenom");
	        String nom = request.getParameter("nom");

	        HttpSession session = request.getSession();

	        if (prenom != null && !prenom.isEmpty() && nom != null && !nom.isEmpty()) {
	            // L'utilisateur a fourni un nom et prénom, on enregistre les valeurs dans la session
	            session.setAttribute("prenom", prenom);
	            session.setAttribute("nom", nom);
	        }

	        // Redirection vers la vue adéquate
	        response.sendRedirect(request.getContextPath() + "/welcome.jsp");
	    }
	}


