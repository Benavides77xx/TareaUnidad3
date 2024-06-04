package insta.curosM4A.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import insta.curosM4A.models.dao.INegocio;
import insta.curosM4A.models.entity.Negocio;

public class NegocioServiceimpl implements INegocioService{
	
	@Autowired
	private INegocio ClienteDao;
	@Override
	@Transactional (readOnly=true)
	
	public List<Negocio> findAll() {
		return (List<Negocio>) ClienteDao.findAll();
	}
	@Override
	@Transactional
	public Negocio save(Negocio conyugue) {
		// TODO Auto-generated method stub
		return ClienteDao.save(conyugue);
	}
	@Override
	@Transactional(readOnly=true)
	public Negocio findById(Long ruc) {
		// TODO Auto-generated method stub
		return ClienteDao.findById(ruc).orElse(null);
		
	}
	@Override
	@Transactional
	public void delete(Long ruc) {
		// TODO Auto-generated method stub
		ClienteDao.deleteById(ruc);
	}

}
