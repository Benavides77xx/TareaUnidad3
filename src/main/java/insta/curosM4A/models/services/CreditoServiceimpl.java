package insta.curosM4A.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import insta.curosM4A.models.dao.ICredito;
import insta.curosM4A.models.entity.Credito;

public class CreditoServiceimpl implements ICreditoService {
	@Autowired
	private ICredito ClienteDao;
	@Override
	@Transactional (readOnly=true)
	
	public List<Credito> findAll() {
		return (List<Credito>) ClienteDao.findAll();
	}
	@Override
	@Transactional
	public Credito save(Credito conyugue) {
		// TODO Auto-generated method stub
		return ClienteDao.save(conyugue);
	}
	@Override
	@Transactional(readOnly=true)
	public Credito findById(Long cedula) {
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
