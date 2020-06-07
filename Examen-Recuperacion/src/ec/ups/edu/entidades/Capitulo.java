package ec.ups.edu.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Capitulo
 *
 */
@Entity

public class Capitulo implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private int numero;
	private String titulo;		
	@ManyToOne
	@JoinColumn
	private Libro codigoli;
	@OneToOne
	@JoinColumn
	private Autor codigoautor;
	public Capitulo() {
		
	}

}
