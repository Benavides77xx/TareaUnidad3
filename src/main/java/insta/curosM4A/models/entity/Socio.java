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
@Table(name = "Socio")
public class Socio implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cedula;

	private String nombre;
	private String apellido;
	private String lugar_nacimiento;
	private String profesion;
	private int numero_casa;
	private String provincia;
	private int edad;
	private String sector;
	private String correo;
	private String tipo_casa;
	private int tiempo_residencia;
	private String genero;
	private String caarpeta;
	private String direccion;
	private String ciudad;
	private String referencia;
	private int celular;
	private String propietario;
	private int numero_propietario;
	private String estado_civil;
	private int personas_dependientes;
	private String parroquia;
	private int telefono;
	
	@Column(name = "fecha nacimiento")
	@Temporal(TemporalType.DATE)
	private Date fecha_nacimiento;

	@PrePersist
	public void prePersist() {
		fecha_nacimiento = new Date();
		
		
		
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getLugar_nacimiento() {
		return lugar_nacimiento;
	}

	public void setLugar_nacimiento(String lugar_nacimiento) {
		this.lugar_nacimiento = lugar_nacimiento;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public int getNumero_casa() {
		return numero_casa;
	}

	public void setNumero_casa(int numero_casa) {
		this.numero_casa = numero_casa;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTipo_casa() {
		return tipo_casa;
	}

	public void setTipo_casa(String tipo_casa) {
		this.tipo_casa = tipo_casa;
	}

	public int getTiempo_residencia() {
		return tiempo_residencia;
	}

	public void setTiempo_residencia(int tiempo_residencia) {
		this.tiempo_residencia = tiempo_residencia;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCaarpeta() {
		return caarpeta;
	}

	public void setCaarpeta(String caarpeta) {
		this.caarpeta = caarpeta;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
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

	public int getCelular() {
		return celular;
	}

	public void setCelular(int celular) {
		this.celular = celular;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public int getNumero_propietario() {
		return numero_propietario;
	}

	public void setNumero_propietario(int numero_propietario) {
		this.numero_propietario = numero_propietario;
	}

	public String getEstado_civil() {
		return estado_civil;
	}

	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}

	public int getPersonas_dependientes() {
		return personas_dependientes;
	}

	public void setPersonas_dependientes(int personas_dependientes) {
		this.personas_dependientes = personas_dependientes;
	}

	public String getParroquia() {
		return parroquia;
	}

	public void setParroquia(String parroquia) {
		this.parroquia = parroquia;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	
	
}

