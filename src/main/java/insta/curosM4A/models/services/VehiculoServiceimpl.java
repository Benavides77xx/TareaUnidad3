package insta.curosM4A.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import insta.curosM4A.models.dao.IVehiculo;
import insta.curosM4A.models.entity.Vehiculo;

public class VehiculoServiceimpl implements IVehiculoService {
	@Autowired
	private IVehiculo ClienteDao;
	@Override
	@Transactional (readOnly=true)
	
	public List<Vehiculo> findAll() {
		return (List<Vehiculo>) ClienteDao.findAll();
	}
	@Override
	@Transactional
	public Vehiculo save(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		return ClienteDao.save(vehiculo);
	}
	@Override
	@Transactional(readOnly=true)
	public Vehiculo findById(Long placa) {
		// TODO Auto-generated method stub
		return ClienteDao.findById(placa).orElse(null);
		
	}
	@Override
	@Transactional
	public void delete(Long placa) {
		// TODO Auto-generated method stub
		ClienteDao.deleteById(placa);
	}
}
