package ec.ups.edu.jpa;

import ec.ups.edu.dao.AutorDao;
import ec.ups.edu.entidades.Autor;

public class JPAAutorDao extends JPAGenericDao<Autor, Integer>  implements AutorDao {
	public JPAAutorDao()  {
		super(Autor.class);
	}
}
