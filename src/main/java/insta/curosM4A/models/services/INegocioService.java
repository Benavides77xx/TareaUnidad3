package insta.curosM4A.models.services;

import java.util.List;

import insta.curosM4A.models.entity.Negocio;

public interface INegocioService {
	public List<Negocio> findAll();
	public Negocio save(Negocio negocio);
	public Negocio findById(Long ruc);
	public void delete(Long ruc);

}
