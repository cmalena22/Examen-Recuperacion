package ec.ups.edu.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Capitulo
 *
 */
@Entity

public class Capitulo implements Serializable {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private int numero;
	private String titulo;
	@OneToOne
	@JoinColumn
	private Autor codigoautor;	
	@ManyToOne
	@JoinColumn
	private Libro codigolibro;
	
	
	
	private static final long serialVersionUID = 1L;

	public Capitulo() {
		
	}

}
