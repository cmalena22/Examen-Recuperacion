package ec.ups.edu.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.ups.edu.dao.DaoFactory;
import ec.ups.edu.dao.LibroDao;
import ec.ups.edu.entidades.Libro;

/**
 * Servlet implementation class AgregarLibro
 */
@WebServlet("/AgregarLibro")
public class AgregarLibro extends HttpServlet {
	private static final long serialVersionUID = 1L;
	LibroDao dao = DaoFactory.getFactory().getLibroDao();
	
	//JDBCTelefonoDAO tel= new JDBCTelefonoDAO();
	Libro libro=new Libro();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgregarLibro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String accion=request.getParameter("accion");
		switch (accion) {		
		case "Listar":
			System.out.println("shdbsdhfbshfbsfh");
			  response.sendRedirect("/Examen-Recuperacion/JSPs/ListarLibro.jsp");  
			//request.getRequestDispatcher("../html/index.html").forward(request, response);
			  break;
		
		default:
			  break;
			
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//JDBCPersonaDAO dd= new JDBCPersonaDAO();
		String nombre=request.getParameter("nombre");
		String isbn=request.getParameter("isbn");
		int numpag=Integer.valueOf(request.getParameter("num"));
		libro.setISBN(isbn);
		libro.setNombre(nombre);
		libro.setNumpaginas(numpag);
		
		
		dao.create(libro);
			//request.setAttribute("telefono", modi);
			request.getRequestDispatcher("/JSPs/RegistraLibro.jsp").forward(request, response);
	}

}
