package ec.ups.edu.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Autor
 *
 */
@Entity

public class Autor implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private String nombre;
	private String nacionalidad;
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "codigoautor")
	private Capitulo codigoautor;
	

   
}
