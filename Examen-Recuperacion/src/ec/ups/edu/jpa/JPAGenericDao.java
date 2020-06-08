package ec.ups.edu.jpa;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import ec.ups.edu.dao.CapituloDao;
import ec.ups.edu.dao.DaoFactory;
import ec.ups.edu.dao.GenericDao;
import ec.ups.edu.entidades.Capitulo;
import ec.ups.edu.entidades.Libro;
public class  JPAGenericDao<T,ID> implements GenericDao<T, ID> {
	 private Class<T> persistentClass;
	    protected EntityManager em;

	    public JPAGenericDao(Class<T> persistentClass) {
	    	this.persistentClass = persistentClass;
			this.em = Persistence.createEntityManagerFactory("jpa").createEntityManager();
		   
		}
	
	@Override
	public void create(T entity) {
		em.getTransaction().begin();
		try {
			em.persist(entity);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println("----------------Error:JPAGenericDao:create"+e);
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
		}
		
	}

	@Override
	public T read(ID id) {		
		return em.find(persistentClass, id);
	}

	@Override
	public void update(T entity) {
		em.getTransaction().begin();
		try {
			em.merge(entity);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println("++++++++++++++++++++++++Error:JPAGenericDAO:update"+e);
				if (em.getTransaction().isActive()) {
					em.getTransaction().rollback();
				}	
		}
		
	}

	@Override
	public void delete(T entity) {
		em.getTransaction().begin();
		try {
			em.remove(entity);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println("*****************Error:JPAGenericDAO:delete"+e);
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
		}
		
	}

	@Override
	public void deleteById(ID id) {
		T entity=this.read(id);
		if (entity !=null) {
			this.delete(entity);
		}
		
	}

	 @SuppressWarnings({ "rawtypes", "unchecked" })
	    @Override
	    public List<T> find() {
		em.getTransaction().begin();
		List<T> lista = null;
		try {
		    javax.persistence.criteria.CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
		    cq.select(cq.from(persistentClass));
		    lista = em.createQuery(cq).getResultList();
		    em.getTransaction().commit();
		} catch (Exception e) {
		    e.printStackTrace();
		}
		return lista;
	    }
	@Override
	public List<T> find(String[] attributes, String[] values) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> find(String[] attributes, String[] values, String order, int index, int size) {
		return null;
		
	    }
	public Libro retornar(String nombre,String isbn) {
		Libro libro=new Libro();
		try {
			String sql="SELECT l FROM Libro l where l.nombre='"+nombre+"' and l.ISBN='"+isbn+"'";
			Query query = em.createQuery(sql);
			libro=(Libro) query.getSingleResult();
			System.out.println("recupere"+libro);	
		} catch (Exception e) {
			System.out.println("Usuario no encontrado"+e.getMessage());
		}
			
		return libro;
		
	}
	
	public List<Capitulo>  findbyUserId() {
		
		CapituloDao dao= DaoFactory.getFactory().getCapituloDao();	
		
		//Capitulo usu=dao.read(cedula);
		String sql=("select libro.codigo,libro.nombre,libro.isbn,libro.NUMPAGINAS,capitulo.numero,capitulo.titulo,autor.nombre,autor.codigo,autor.NACIONALIDAD from capitulo\r\n" + 
				"		inner join libro on CODIGOLIBRO_CODIGO=libro.CODIGO" + 
				"		inner join autor on CODIGOAUTOR_CODIGO=autor.CODIGO");	
		List<Capitulo> list=em.createQuery(sql).getResultList();
							
		return list;
	
		
	}
}
