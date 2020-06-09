package ec.ups.edu.jpa;

import java.util.ArrayList;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import ec.ups.edu.dao.AutorDao;
import ec.ups.edu.dao.CapituloDao;
import ec.ups.edu.dao.DaoFactory;
import ec.ups.edu.dao.GenericDao;
import ec.ups.edu.entidades.Autor;
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
	@SuppressWarnings("unchecked")
	public List<Capitulo>  findbyUserId() {	
		//c.codigolibro.nombre,c.codigolibro.ISBN,c.codigolibro.numpaginas,c.codigoautor.nombre,c.codigoautor.nacionalidad,c.numero,c.titulo
		String sql = ("SELECT c FROM Capitulo c");
		List<Capitulo> list = em.createQuery(sql).getResultList();
		System.out.println("sdfsdfsd" + list);
		 for (Capitulo c : list) {
		    System.out.println("Nombre Libro:"+c.getCodigolibro().getNombre());
		    System.out.println("ISBN Libro:"+c.getCodigolibro().getISBN());
		    System.out.println("Numero pagina libro:"+c.getCodigolibro().getNumpaginas());
		    System.out.println("Capitulo titulo:"+c.getTitulo());
		    System.out.println("Capitulo numero:"+c.getNumero());
		    System.out.println("Nombre Autor:"+c.getCodigoautor().getNombre());
		    System.out.println("Nacionalidad Autor:"+c.getCodigoautor().getNacionalidad());
		  }
		
		return list;	
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Capitulo>  findbyAutor(String nombre) {	
		String sql = ("SELECT c FROM Capitulo c where c.codigoautor.nombre='"+nombre+"'");
		List<Capitulo> list = em.createQuery(sql).getResultList();
		System.out.println("sdfsdfsd" + list);
		 for (Capitulo c : list) {
		    System.out.println("Nombre Libro:"+c.getCodigolibro().getNombre());
		    System.out.println("ISBN Libro:"+c.getCodigolibro().getISBN());
		    System.out.println("Numero pagina libro:"+c.getCodigolibro().getNumpaginas());
		    System.out.println("Capitulo titulo:"+c.getTitulo());
		    System.out.println("Capitulo numero:"+c.getNumero());
		    System.out.println("Nombre Autor:"+c.getCodigoautor().getNombre());
		    System.out.println("Nacionalidad Autor:"+c.getCodigoautor().getNacionalidad());
		  }
		
	return list;	
		
		
	}

	@Override
	public List<Capitulo> findbyCapitulo(String titulo) {
		String sql = ("SELECT c FROM Capitulo c where c.titulo='"+titulo+"'");
		List<Capitulo> list = em.createQuery(sql).getResultList();
		System.out.println("sdfsdfsd" + list);
		 for (Capitulo c : list) {
		    System.out.println("Nombre Libro:"+c.getCodigolibro().getNombre());
		    c.getCodigolibro().getCodigo();
		    System.out.println("ISBN Libro:"+c.getCodigolibro().getISBN());
		    System.out.println("Numero pagina libro:"+c.getCodigolibro().getNumpaginas());
		    System.out.println("Capitulo titulo:"+c.getTitulo());
		    System.out.println("Capitulo numero:"+c.getNumero());
		    System.out.println("Nombre Autor:"+c.getCodigoautor().getNombre());
		    System.out.println("Nacionalidad Autor:"+c.getCodigoautor().getNacionalidad());
		  }
		
		return list;
	}
}
