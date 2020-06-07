package ec.ups.edu.entidades;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Libro
 *
 */
@Entity

public class Libro implements Serializable {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private String nombre;
	private String ISBN;
	private int numpaginas;	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "codigolibro")	
	private Set<Capitulo>capitulo;
	
	private static final long serialVersionUID = 1L;

	public Libro() {
		
	}

	public Libro(String nombre, String iSBN, int numpaginas) {
		super();
		this.nombre = nombre;
		ISBN = iSBN;
		this.numpaginas = numpaginas;
		//this.capitulo = capitulo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public int getNumpaginas() {
		return numpaginas;
	}

	public void setNumpaginas(int numpaginas) {
		this.numpaginas = numpaginas;
	}

	public Set<Capitulo> getCapitulo() {
		return capitulo;
	}

	public void setCapitulo(Set<Capitulo> capitulo) {
		this.capitulo = capitulo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Libro [codigo=" + codigo + ", nombre=" + nombre + ", ISBN=" + ISBN + ", numpaginas=" + numpaginas
				+  "]";
	}
   
}
