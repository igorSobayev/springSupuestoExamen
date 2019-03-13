package com.dawes.modelo;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "lineasparte")
public class LineaParteVO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "idpartegastos", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idParteGastos;

	@Column(nullable = true, name = "fecha")
	private Date fecha;

	@Column(nullable = true, name = "importe")
	private Float importe;

	@ManyToOne
	@JoinColumn(name = "idgastos")
	private GastosVO gastos;

	@ManyToOne
	@JoinColumn(name = "idparte")
	private ParteVO parte;

	public LineaParteVO() {
	}

	public LineaParteVO(int idParteGastos) {
		super();
		this.idParteGastos = idParteGastos;
	}

	public LineaParteVO(int idParteGastos, Date fecha, Float importe, GastosVO gastos, ParteVO parte) {
		super();
		this.idParteGastos = idParteGastos;
		this.fecha = fecha;
		this.importe = importe;
		this.gastos = gastos;
		this.parte = parte;
	}

	public LineaParteVO(Float importe) {
		super();
		this.importe = importe;
	}

	public int getIdParteGastos() {
		return idParteGastos;
	}

	public void setIdParteGastos(int idParteGastos) {
		this.idParteGastos = idParteGastos;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}



	public Float getImporte() {
		return importe;
	}

	public void setImporte(Float importe) {
		this.importe = importe;
	}

	public GastosVO getGastos() {
		return gastos;
	}

	public void setGastos(GastosVO gastos) {
		this.gastos = gastos;
	}

	public ParteVO getParte() {
		return parte;
	}

	public void setParte(ParteVO parte) {
		this.parte = parte;
	}

	@Override
	public int hashCode() {
		return Objects.hash(importe);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LineaParteVO other = (LineaParteVO) obj;
		return Objects.equals(importe, other.importe);
	}

	@Override
	public String toString() {
		return "ParteGastos [idParteGastos=" + idParteGastos + ", fecha=" + fecha +  ", importe=" + importe + "]";
	}

}
