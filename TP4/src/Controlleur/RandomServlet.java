package Controlleur;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Modele.NumberBean;

/**
 * Servlet implementation class RandomServlet
 */
@WebServlet("/RandomServlet")
public class RandomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RandomServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		NumberBean n = new NumberBean();
		double x = n.calculRandom(Double.parseDouble(request.getParameter("nombrealeat")));
		request.setAttribute("x", x);
		request.getRequestDispatcher("random.jsp").forward(request, response);
	    }
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		   // Récupérer les paramètres saisis par l'utilisateur
    /*    int min = Integer.parseInt(request.getParameter("min"));
        int max = Integer.parseInt(request.getParameter("max"));

        // Vérifier si l'intervalle est valide
        if (min > max) {
            // Gérer l'erreur de saisie de l'intervalle
            request.setAttribute("random", "L'intervalle saisi est invalide. Veuillez saisir un minimum inférieur ou égal au maximum.");
            request.getRequestDispatcher("/random.jsp").forward(request, response);
        } else {
            // Calculer le nombre aléatoire dans l'intervalle spécifié
            int randomNumber = (int) (Math.random() * (1 - 0 + 1)) + 0;

            // Ajouter le nombre aléatoire à la requête pour l'afficher dans la vue
            request.setAttribute("randomNumber", randomNumber);

            // Redirection vers la vue pour afficher le résultat
            request.getRequestDispatcher("/result.jsp").forward(request, response);
        }*/
		
    }
	}


