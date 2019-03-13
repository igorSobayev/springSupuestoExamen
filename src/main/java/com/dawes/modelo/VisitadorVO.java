package com.dawes.modelo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "visitadores")
public class VisitadorVO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idvisitador", nullable = false)
	private int idVisitador;

	@Column(name = "nombre", length = 100, nullable = true)
	private String nombre;

	@OneToMany(mappedBy = "visitador")
	private Set<ParteVO> setPartes;

	public int getIdVisitador() {
		return idVisitador;
	}

	public void setIdVisitador(int idVisitador) {
		this.idVisitador = idVisitador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
//	public void addAlumno(AlumnoCursoVO ac) {
//		this.alumnos.add(ac);
//	}

	public void addParte(ParteVO p) {
		this.setPartes.add(p);
	}

	public Set<ParteVO> getSetPartes() {
		return setPartes;
	}

	public void setSetPartes(Set<ParteVO> setPartes) {
		this.setPartes = setPartes;
	}

	public VisitadorVO() {

	}

	public VisitadorVO(int idVisitador) {
		super();
		this.idVisitador = idVisitador;
		setPartes = new HashSet<ParteVO>(0);
	}

	public VisitadorVO(int idVisitador, String nombre) {
		super();
		this.idVisitador = idVisitador;
		this.nombre = nombre;
		setPartes = new HashSet<ParteVO>(0);
	}

	public VisitadorVO(String nombre) {
		super();
		this.nombre = nombre;
		setPartes = new HashSet<ParteVO>(0);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VisitadorVO other = (VisitadorVO) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "[" + nombre + "]";
	}

}
