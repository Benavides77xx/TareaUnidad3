package insta.curosM4A.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import insta.curosM4A.models.dao.ISocio;
import insta.curosM4A.models.entity.Socio;

public class SocioServiceimpl implements ISocioService {
	@Autowired
	private ISocio ClienteDao;
	@Override
	@Transactional (readOnly=true)
	
	public List<Socio> findAll() {
		return (List<Socio>) ClienteDao.findAll();
	}
	@Override
	@Transactional
	public Socio save(Socio socio) {
		// TODO Auto-generated method stub
		return ClienteDao.save(socio);
	}
	@Override
	@Transactional(readOnly=true)
	public Socio findById(Long cedula) {
		// TODO Auto-generated method stub
		return ClienteDao.findById(cedula).orElse(null);
		
	}
	@Override
	@Transactional
	public void delete(Long cedula) {
		// TODO Auto-generated method stub
		ClienteDao.deleteById(cedula);
	}
}
