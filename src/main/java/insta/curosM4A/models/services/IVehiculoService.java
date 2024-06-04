package insta.curosM4A.models.services;

import java.util.List;

import insta.curosM4A.models.entity.Vehiculo;

public interface IVehiculoService {
	public List<Vehiculo> findAll();
	public Vehiculo save(Vehiculo socio);
	public Vehiculo findById(Long placa);
	public void delete(Long placa);
}
