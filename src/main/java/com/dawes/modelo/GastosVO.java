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
@Table(name = "gastos")
public class GastosVO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "idgastos", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idGastos;

	@Column(nullable = true, name = "denominacion", length = 100)
	private String denominacion;

	@OneToMany(mappedBy = "gastos")
	private Set<LineaParteVO> setParteGastos;

	public GastosVO() {
	}

	public GastosVO(int idGastos) {
		super();
		this.idGastos = idGastos;
		setParteGastos = new HashSet<LineaParteVO>(0);
	}

	public GastosVO(int idGastos, String denominacion) {
		super();
		this.idGastos = idGastos;
		this.denominacion = denominacion;
		setParteGastos = new HashSet<LineaParteVO>(0);
	}

	public GastosVO(String denominacion) {
		super();
		this.denominacion = denominacion;
		setParteGastos = new HashSet<LineaParteVO>(0);
	}

	public Set<LineaParteVO> getSetParteGastos() {
		return setParteGastos;
	}

	public void setSetParteGastos(Set<LineaParteVO> setParteGastos) {
		this.setParteGastos = setParteGastos;
	}

	public int getIdGastos() {
		return idGastos;
	}

	public void setIdGastos(int idGastos) {
		this.idGastos = idGastos;
	}

	public String getDenominacion() {
		return denominacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(denominacion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GastosVO other = (GastosVO) obj;
		return Objects.equals(denominacion, other.denominacion);
	}

	@Override
	public String toString() {
		return "Gastos [idGastos=" + idGastos + ", denominacion=" + denominacion + "]";
	}

}
