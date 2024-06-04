package insta.curosM4A.models.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import insta.curosM4A.models.dao.IConyugue;
import insta.curosM4A.models.entity.Conyugue;
import insta.curosM4A.models.services.IConyugueService;

public class ConyugueRestController {
	@Autowired
	private IConyugueService clienteService;
	
	@GetMapping("/conyugues") 
	public List<Conyugue> index(){
		return  clienteService.findAll();	
	}
		
		@GetMapping("/conyugues/{cedula}")
		public Conyugue show(@PathVariable Long id) {
			return clienteService.findById(id);		
		}
		
		@PostMapping("/conyugues")
		@ResponseStatus(HttpStatus.CREATED)
		public Conyugue create(@RequestBody Conyugue cliente) {
			return clienteService.save(cliente);
			
		}
		
		@PutMapping("/conyugues/{cedula}")
		public Conyugue update(@RequestBody Conyugue cliente, @PathVariable Long id) {
			Conyugue clienteActual= clienteService.findById(id);
			clienteActual.setNombre(cliente.getNombre());
	        clienteActual.setProfesion(cliente.getProfesion());
	        clienteActual.setDireccion(cliente.getDireccion());
	        clienteActual.setEdad(cliente.getEdad());
	        clienteActual.setArea(cliente.getArea());
	        clienteActual.setEmpresa(cliente.getEmpresa());
	        clienteActual.setAños(cliente.getAños());
	        clienteActual.setTelefono(cliente.getTelefono());
	        clienteActual.setFechaNacimiento(cliente.getFecha_nacimiento());
			
		}
		
		@DeleteMapping("/clientes/{id}")
		@ResponseStatus(HttpStatus.NO_CONTENT)
		public void delete(@PathVariable Long id) {
			clienteService.delete(id);
		}
}
