package insta.curosM4A.models.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
@Entity
@Table(name = "Vehiculo")
public class Vehiculo implements Serializable{

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Placa;

	private String TipoVehiculo;
	private int año_fabricacion;
	private String marca;
	private double valor;
	public String getTipoVehiculo() {
		return TipoVehiculo;
	}
	public void setTipoVehiculo(String tipoVehiculo) {
		TipoVehiculo = tipoVehiculo;
	}
	public int getAño_fabricacion() {
		return año_fabricacion;
	}
	public void setAño_fabricacion(int año_fabricacion) {
		this.año_fabricacion = año_fabricacion;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
}
