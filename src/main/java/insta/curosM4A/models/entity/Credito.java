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
@Table(name = "Credito")
public class Credito implements Serializable{
	

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numero_sol;

	private String provincia;
	private String forma_pago;
	private String Ciudad;
	private String inversion;
	private int plazo;
	private String tipo_credito;
	private double valor_solicitado;
    private String estado;


	@Column(name = "fecha")
	@Temporal(TemporalType.DATE)
	private Date fecha;

	@PrePersist
	public void prePersist() {
		fecha = new Date();
		
		
		
		
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getForma_pago() {
		return forma_pago;
	}

	public void setForma_pago(String forma_pago) {
		this.forma_pago = forma_pago;
	}

	public String getCiudad() {
		return Ciudad;
	}

	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}

	public String getInversion() {
		return inversion;
	}

	public void setInversion(String inversion) {
		this.inversion = inversion;
	}

	public int getPlazo() {
		return plazo;
	}

	public void setPlazo(int plazo) {
		this.plazo = plazo;
	}

	public String getTipo_credito() {
		return tipo_credito;
	}

	public void setTipo_credito(String tipo_credito) {
		this.tipo_credito = tipo_credito;
	}

	public double getValor_solicitado() {
		return valor_solicitado;
	}

	public void setValor_solicitado(double valor_solicitado) {
		this.valor_solicitado = valor_solicitado;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}
