package ec.ups.edu.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.ups.edu.dao.CapituloDao;
import ec.ups.edu.dao.DaoFactory;
import ec.ups.edu.entidades.Capitulo;
import ec.ups.edu.jpa.JPACapituloDao;
import ec.ups.edu.jpa.JPADaoFactory;


/**
 * Servlet implementation class ListarLibro
 */
@WebServlet("/ListarLibro")
public class ListarLibro extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	    private CapituloDao dao;
	 
	    /**
	     * @see HttpServlet#HttpServlet()
	     */
	    public ListarLibro() {
	        super();
	        dao=DaoFactory.getFactory().getCapituloDao();
	        // TODO Auto-generated constructor stub
	    }

		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			String accion=request.getParameter("accion");
			switch (accion) {		
			
			case "Registrar":
				System.out.println("shdbsdhfbshfbsfh");
				  response.sendRedirect("/TELEFONOSJPA/JSPs/AgregarLibro.jsp");  
				 
				//request.getRequestDispatcher("../html/index.html").forward(request, response);
				  break;
			default:
				  break;
				
			}
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
		
		//List<Capitulo>lista=JPADaoFactory.getFactory().getCapituloDao().finallby(cedula);
		//System.out.println(lista);
	//	request.setAttribute("telefono", lista);
		request.getRequestDispatcher("/JSPs/ListarTelefono.jsp").forward(request, response);
		
		}
}
