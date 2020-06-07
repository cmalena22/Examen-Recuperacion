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

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private String nombre;
	private String ISBN;
	private int numpaginas;	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "codigoli")	
	private Set<Capitulo>capitulo;	

	public Libro() {
		
	}
}