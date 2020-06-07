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

	public Capitulo(int numero, String titulo, Autor codigoautor, Libro codigolibro) {
		super();
		this.numero = numero;
		this.titulo = titulo;
		this.codigoautor = codigoautor;
		this.codigolibro = codigolibro;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Autor getCodigoautor() {
		return codigoautor;
	}

	public void setCodigoautor(Autor codigoautor) {
		this.codigoautor = codigoautor;
	}

	public Libro getCodigolibro() {
		return codigolibro;
	}

	public void setCodigolibro(Libro codigolibro) {
		this.codigolibro = codigolibro;
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
		Capitulo other = (Capitulo) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Capitulo [codigo=" + codigo + ", numero=" + numero + ", titulo=" + titulo + ", codigoautor="
				+ codigoautor + ", codigolibro=" + codigolibro + "]";
	}

}
