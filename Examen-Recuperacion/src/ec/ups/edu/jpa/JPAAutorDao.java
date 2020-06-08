package ec.ups.edu.jpa;

import ec.ups.edu.dao.AutorDao;
import ec.ups.edu.entidades.Autor;

public class JPAAutorDao extends JPAGenericDao<Autor, String>  implements AutorDao {
	public JPAAutorDao()  {
		super(Autor.class);
	}
}
