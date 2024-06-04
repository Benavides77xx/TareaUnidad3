package insta.curosM4A.models.services;

import java.util.List;

import insta.curosM4A.models.entity.Conyugue;

public interface IConyugueService {
	public List<Conyugue> findAll();
	public Conyugue save(Conyugue conyugue);
	public Conyugue findById(Long cedula);
	public void delete(Long cedula);
}
