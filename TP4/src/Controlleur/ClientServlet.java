package Controlleur;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Modele.ClientBean;

/**
 * Servlet implementation class ClientServlet
 */
@WebServlet("/ClientServlet")
public class ClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RequestDispatcher displnf;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String nom=request.getParameter("t1");//elle partage quelque formation howa variable mawjoud fil page formulaire html
		String prenom=request.getParameter("t2");
		String adresseliv=request.getParameter("t3");
		String tel=request.getParameter("t4");
		String email=request.getParameter("t5");
		ClientBean client = new  ClientBean();
		client.setNom(nom);
		client.setPrenom(prenom);
		client.setAdresseliv(adresseliv);
		client.setTel(tel);
		client.setEmail(email);
		request.setAttribute("client", client);
		/*request.setAttribute("t1",nom);
	    request.setAttribute("t2",prenom);
	    request.setAttribute("t3",adresseliv);
	    request.setAttribute("t4",tel);
	    request.setAttribute("t5",email);*/
	    
	    displnf = request.getRequestDispatcher("/client.jsp");
	   displnf.forward(request,response);
	    
		
	}

	private void setEmail(String email) {
		// TODO Auto-generated method stub
		
	}

	private void setTel(String tel) {
		// TODO Auto-generated method stub
		
	}

	private void setPrenom(String prenom) {
		// TODO Auto-generated method stub
		
	}

	private void setadresseliv(String adresseliv) {
		// TODO Auto-generated method stub
		
	}

	private void setNom(String nom) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doGet(request, response);
	}


}
