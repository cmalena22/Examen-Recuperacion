package ec.ups.edu.jpa;


import ec.ups.edu.dao.LibroDao;
import ec.ups.edu.entidades.Libro;

public class JPALibroDao  extends JPAGenericDao<Libro, Integer>  implements LibroDao {
	public JPALibroDao()  {
		super(Libro.class);
	}

}
