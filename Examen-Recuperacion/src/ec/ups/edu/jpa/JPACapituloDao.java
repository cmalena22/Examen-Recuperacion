package ec.ups.edu.jpa;

import ec.ups.edu.dao.CapituloDao;
import ec.ups.edu.entidades.Capitulo;

public class JPACapituloDao  extends JPAGenericDao<Capitulo, Integer>  implements CapituloDao {
	public JPACapituloDao()  {
		super(Capitulo.class);
	}

}
