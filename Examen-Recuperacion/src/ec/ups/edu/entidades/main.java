package ec.ups.edu.entidades;

import ec.ups.edu.dao.AutorDao;
import ec.ups.edu.dao.CapituloDao;
import ec.ups.edu.dao.DaoFactory;
import ec.ups.edu.dao.LibroDao;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutorDao au= DaoFactory.getFactory().getAutorDao();
		CapituloDao cap=DaoFactory.getFactory().getCapituloDao();
		LibroDao li=DaoFactory.getFactory().getLibroDao();
	
		//AutorDao au= DaoFactory.getFactory().getAutorDao();
		/*Capitulo c= new Capitulo();
		c.setNumero(1);
		c.setTitulo("Hola");
		c.setCodigoautor(new Autor("Luis","Ecuatoriano",c));
		cap.create(c);*/
		Libro libro =  new Libro();
		libro.setISBN("2132");
		libro.setNombre("CCCCC");
		libro.setNumpaginas(11);
		//li.create(libro);
		/**
		 * select libro.codigo,libro.nombre,libro.isbn,libro.NUMPAGINAS,capitulo.numero,capitulo.titulo,autor.nombre,autor.codigo,autor.NACIONALIDAD from capitulo
inner join libro on CODIGOLIBRO_CODIGO=libro.CODIGO
inner join autor on CODIGOAUTOR_CODIGO=autor.CODIGO;
		 */
	
		Libro dos= li.read(5);
		//li.delete(dos);
		//System.out.println(dos.toString());
		Autor autor= new Autor();
		autor.setNacionalidad("Ecuatoriano");
		autor.setNombre("dfgdfg");
		//au.create(autor);
		Autor d=au.read(4);
		//au.delete(d);
		Capitulo c= new Capitulo();
		c.setNumero(1);
		c.setTitulo("Hola");
		c.setCodigolibro(dos);
		//c.setCodigoautor(d);
		//cap.create(c);
	//	System.out.println("dkfdfhdf");
		//System.out.println(li.retornar("CCCCC", "2132"));
		//Capitulo capp= cap.read(2);
	//	cap.delete(capp);
		System.out.println("Recuperacion");
		System.out.println(cap.findbyUserId());
		//System.out.println(cap.find());
	} 

}
