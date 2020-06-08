package ec.ups.edu.dao;

import java.util.List;

import ec.ups.edu.entidades.Autor;
import ec.ups.edu.entidades.Capitulo;
import ec.ups.edu.entidades.Libro;


public interface GenericDao <T,ID> {
	public void create(T entity);
	public T read(ID id);
	public Libro retornar(String nombre,String isbn);
	public List<Capitulo>  findbyUserId();
	public List<Capitulo>  findbyAutor(String nombre);
	public List<Capitulo>  findbyCapitulo(String titulo);
}
