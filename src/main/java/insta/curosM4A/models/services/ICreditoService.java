package insta.curosM4A.models.services;

import java.util.List;
import insta.curosM4A.models.entity.Credito;
public interface ICreditoService {
	public List<Credito> findAll();
	public Credito save(Credito credito);
	public Credito findById(Long numero_sol);
	public void delete(Long numero_sol);
}
