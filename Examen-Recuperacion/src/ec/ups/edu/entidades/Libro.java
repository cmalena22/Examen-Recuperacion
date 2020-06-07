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
   
}
