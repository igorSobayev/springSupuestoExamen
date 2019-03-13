package com.dawes.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "partes")
public class ParteVO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "idparte", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idParte;

	@Column(nullable = true, name = "numparte", length = 13)
	private String numParte;

	@Column(nullable = true, name = "fecha")
	private Date fecha;

	
	@Column(nullable = true, name = "totalgastos")
	private Float totalGastos;

	@ManyToOne
	@JoinColumn(name = "idvisitador")
	private VisitadorVO visitador;



	@OneToMany(mappedBy = "parte")
	private Set<LineaParteVO> setParteGastos;




	public ParteVO() {

	}




	public ParteVO(int idParte, String numParte, Date fecha,
			Float totalGastos, VisitadorVO visitador, GastosVO gastos, ParteVO parte) {
		super();
		this.idParte = idParte;
		this.numParte = numParte;
		this.fecha = fecha;
		this.totalGastos = totalGastos;
		this.visitador = visitador;

	}

	public int getIdParte() {
		return idParte;
	}

	public void setIdParte(int idParte) {
		this.idParte = idParte;
	}

	public String getNumParte() {
		return numParte;
	}

	public void setNumParte(String numParte) {
		this.numParte = numParte;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public Float getTotalGastos() {
		return totalGastos;
	}

	public void setTotalGastos(Float totalGastos) {
		this.totalGastos = totalGastos;
	}

	public VisitadorVO getVisitador() {
		return visitador;
	}

	public void setVisitador(VisitadorVO visitador) {
		this.visitador = visitador;
	}



	

	public Set<LineaParteVO> getSetParteGastos() {
		return setParteGastos;
	}

	public void setSetParteGastos(Set<LineaParteVO> setParteGastos) {
		this.setParteGastos = setParteGastos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numParte);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ParteVO other = (ParteVO) obj;
		return Objects.equals(numParte, other.numParte);
	}

	@Override
	public String toString() {
		return "Parte [idParte=" + idParte + ", numParte=" + numParte + ", fecha=" + fecha + ", observGastos="
				+  ", totalGastos=" + totalGastos
				+ ", visitador=" + visitador.getIdVisitador() + "]";
	}

	

}
