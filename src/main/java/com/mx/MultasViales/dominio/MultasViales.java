package com.mx.MultasViales.dominio;


import java.sql.Time;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;




@Entity
@Table(name = "multas")
@Data
public class MultasViales {

	// Atributos o campos de la entidad multas
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String entidad;
	private int noBoleta;
	private String modeloVehiculo;
	private String noPlaca;
	private String direccionInfraccion;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date fecha;
	@DateTimeFormat(pattern = "HH:mm:ss")
	@Temporal(TemporalType.TIME)
	private Time hora;
	private double monto;

	// Contructores
	public MultasViales() {
	}

	public MultasViales(Long id) {
		this.id = id;
	}

	public MultasViales(Long id, String entidad, int noBoleta, String modeloVehiculo, String noPlaca,
			String direccionInfraccion, Date fecha, Time hora, double monto) {
		this.id = id;
		this.entidad = entidad;
		this.noBoleta = noBoleta;
		this.modeloVehiculo = modeloVehiculo;
		this.noPlaca = noPlaca;
		this.direccionInfraccion = direccionInfraccion;
		this.fecha = fecha;
		this.hora = hora;
		this.monto = monto;
	}

	@Override
	public String toString() {
		return "MultasViales [id=" + id + ", entidad=" + entidad + ", noBoleta=" + noBoleta + ", modeloVehiculo="
				+ modeloVehiculo + ", noPlaca=" + noPlaca + ", direccionInfraccion=" + direccionInfraccion + ", fecha="
				+ fecha + ", hora=" + hora + ", monto=" + monto + "]";
	}

	
	
	

	
	

	
	

}
