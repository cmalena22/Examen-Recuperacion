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
import ec.ups.edu.entidades.Autor;
import ec.ups.edu.entidades.Capitulo;

/**
 * Servlet implementation class BuscarPorNombre
 */
@WebServlet("/BuscarPorNombre")
public class BuscarPorNombre extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private CapituloDao dao;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuscarPorNombre() {
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
		if (accion.equalsIgnoreCase("Listar")) {
			System.out.println("shdbsdhfbshfbsfh");
			  response.sendRedirect("/Examen-Recuperacion/JSPs/ListarLibro.jsp");  
		}
				
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		String accion=request.getParameter("accion");
		String dato=request.getParameter("buscar");
		
		try {
			List<Capitulo>lista=dao.findbyAutor(dato);
			request.setAttribute("telefono", lista);
			request.getRequestDispatcher("/JSPs/Publicca.jsp").forward(request, response);	
		} catch (Exception e) {
			request.getRequestDispatcher("/JSPs/Publicca.jsp").forward(request, response);			
			
		
		}
					
					
			
		
	}

}
