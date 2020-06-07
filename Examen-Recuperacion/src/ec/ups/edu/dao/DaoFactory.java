package ec.ups.edu.dao;

import ec.ups.edu.jpa.JPADaoFactory;

public abstract class DaoFactory {
	protected static DaoFactory factory= new JPADaoFactory();
	
	public static DaoFactory getFactory() {
		return factory;
	}
	public abstract LibroDao getLibroDao();
	public abstract CapituloDao getCapituloDao();
	public abstract AutorDao getAutorDao();
	
}
