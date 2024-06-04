package insta.curosM4A.models.services;

import java.util.List;

import insta.curosM4A.models.entity.Socio;

public interface ISocioService {
	public List<Socio> findAll();
	public Socio save(Socio socio);
	public Socio findById(Long cedula);
	public void delete(Long cedula);
}
