package insta.curosM4A.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import insta.curosM4A.models.dao.IConyugue;
import insta.curosM4A.models.entity.Conyugue;

public class ConyugueServiceimpl implements IConyugueService{
	@Autowired
	private IConyugue ClienteDao;
	@Override
	@Transactional (readOnly=true)
	
	public List<Conyugue> findAll() {
		return (List<Conyugue>) ClienteDao.findAll();
	}
	@Override
	@Transactional
	public Conyugue save(Conyugue conyugue) {
		// TODO Auto-generated method stub
		return ClienteDao.save(conyugue);
	}
	@Override
	@Transactional(readOnly=true)
	public Conyugue findById(Long cedula) {
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
