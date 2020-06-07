package ec.ups.edu.jpa;

import ec.ups.edu.dao.AutorDao;
import ec.ups.edu.dao.CapituloDao;
import ec.ups.edu.dao.DaoFactory;
import ec.ups.edu.dao.LibroDao;

public class JPADaoFactory extends DaoFactory {

	@Override
	public AutorDao getAutorDao() {
		// TODO Auto-generated method stub
		return new JPAAutorDao();
	}

	@Override
	public LibroDao getLibroDao() {
		// TODO Auto-generated method stub
		return new JPALibroDao();
	}

	@Override
	public CapituloDao getCapituloDao() {
		// TODO Auto-generated method stub
		return new JPACapituloDao();
	}

}
