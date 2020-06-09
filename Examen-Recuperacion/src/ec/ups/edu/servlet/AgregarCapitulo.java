package ec.ups.edu.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.ups.edu.dao.AutorDao;
import ec.ups.edu.dao.CapituloDao;
import ec.ups.edu.dao.DaoFactory;
import ec.ups.edu.dao.LibroDao;
import ec.ups.edu.entidades.Autor;
import ec.ups.edu.entidades.Capitulo;
import ec.ups.edu.entidades.Libro;

/**
 * Servlet implementation class AgregarCapitulo
 */
@WebServlet("/AgregarCapitulo")
public class AgregarCapitulo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	LibroDao daolibro = DaoFactory.getFactory().getLibroDao();
	CapituloDao daocap= DaoFactory.getFactory().getCapituloDao();
	AutorDao daoautor=DaoFactory.getFactory().getAutorDao();
	//JDBCTelefonoDAO tel= new JDBCTelefonoDAO();
	Libro libro=new Libro();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgregarCapitulo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String codigoli=request.getParameter("codigo");
		System.out.println("paaaaaaaaaaaaaaaaaaaa");
				System.out.println(codigoli);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//JDBCPersonaDAO dd= new JDBCPersonaDAO();
		String numero=request.getParameter("capitulo");
		String titulo=request.getParameter("titulo");
		String codigoli=request.getParameter("codigolibro");
		System.out.println("kdjskdjfskjdfksjdfhkjsfsknv");
		System.out.println(codigoli);
		System.out.println(numero);
		System.out.println(titulo);
		/*Capitulo cap= new Capitulo();
		String nombre=request.getParameter("nombre");
		String isbn=request.getParameter("isbn");
		int numpag=Integer.valueOf(request.getParameter("num"));
		int numercap=Integer.valueOf(request.getParameter("capitulo"));
		String titulocap=request.getParameter("titulo");
		
		libro.setISBN(isbn);
		libro.setNombre(nombre);
		libro.setNumpaginas(numpag);		
		daolibro.create(libro);
		
		Libro envio =daolibro.retornar(request.getParameter("nombre"), request.getParameter("isbn"));
		Autor envioau=daoautor.read(5);
		
		Capitulo capitulo = new Capitulo();
		capitulo.setCodigoautor(envioau);
		capitulo.setCodigolibro(envio);
		capitulo.setNumero(numercap);
		capitulo.setTitulo(titulocap);
		System.out.println("Lo que voy enviar");
		System.out.println(libro.toString());
		System.out.println("Lo que recupero librooooooo");
		System.out.println(envio.toString());
		
		System.out.println("Lo que envio autorrrrrrrrrrr");
		System.out.println(envioau.toString());
		
		System.out.println("Ingreso Capitulos");
		System.out.println(capitulo);
		
		daocap.create(capitulo);
			//request.setAttribute("telefono", modi);*/
		request.getRequestDispatcher("/JSPs/ListarLibro.jsp").forward(request, response);
	}
}
