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
@Table(name = "Negocio")
public class Negocio implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ruc;
	private String razon_social;
	private String actividad;
	private int antiguedad;
	private String lugar_ventas;
	private int tiempo_local;
	private String ciudad;
	private String referencia;
	private String Subactividad;
	private String hipotecado;
	private String Direccion;
	private int numeroEmpleado;
	private int numero_casa;
	private int telefono;
	public String getRazon_social() {
		return razon_social;
	}
	public void setRazon_social(String razon_social) {
		this.razon_social = razon_social;
	}
	public String getActividad() {
		return actividad;
	}
	public void setActividad(String actividad) {
		this.actividad = actividad;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	public String getLugar_ventas() {
		return lugar_ventas;
	}
	public void setLugar_ventas(String lugar_ventas) {
		this.lugar_ventas = lugar_ventas;
	}
	public int getTiempo_local() {
		return tiempo_local;
	}
	public void setTiempo_local(int tiempo_local) {
		this.tiempo_local = tiempo_local;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public String getSubactividad() {
		return Subactividad;
	}
	public void setSubactividad(String subactividad) {
		Subactividad = subactividad;
	}
	public String getHipotecado() {
		return hipotecado;
	}
	public void setHipotecado(String hipotecado) {
		this.hipotecado = hipotecado;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public int getNumeroEmpleado() {
		return numeroEmpleado;
	}
	public void setNumeroEmpleado(int numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}
	public int getNumero_casa() {
		return numero_casa;
	}
	public void setNumero_casa(int numero_casa) {
		this.numero_casa = numero_casa;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
	
	
	
}
