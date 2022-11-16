package idat.EC3.WilliamAugustoHernandezSirlupu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.EC3.WilliamAugustoHernandezSirlupu.model.Usuariocliente;
import idat.EC3.WilliamAugustoHernandezSirlupu.repository.UsuarioClienteRepository;

@Service
public class UsuarioClienteServiceImp implements UsuarioClienteService {
	
	@Autowired
	private UsuarioClienteRepository repository;

	@Override
	public List<Usuariocliente> lista() {
		return repository.findAll();
	}

	@Override
	public Usuariocliente obtener(Integer idUsuariocliente) {
		return repository.findById(idUsuariocliente).orElse(null);
	}

	@Override
	public void guardar(Usuariocliente usuariocliente) {
		repository.save(usuariocliente);
		
	}

	@Override
	public void actualizar(Usuariocliente usuariocliente) {
		repository.saveAndFlush(usuariocliente);
		
	}

	@Override
	public void eliminar(Integer idUsuariocliente) {
		repository.deleteById(idUsuariocliente);
		
	}
	
	

}
