package idat.EC3.WilliamAugustoHernandezSirlupu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.EC3.WilliamAugustoHernandezSirlupu.model.Cliente;
import idat.EC3.WilliamAugustoHernandezSirlupu.repository.ClienteRepository;

@Service
public class ClienteServiceImp implements ClienteService {

	@Autowired
	private ClienteRepository repository;
	
	@Override
	public List<Cliente> lista() {
		return repository.findAll();
	}

	@Override
	public Cliente obtener(Integer idCliente) {
		return repository.findById(idCliente).orElse(null);
	}

	@Override
	public void guardar(Cliente cliente) {
		repository.save(cliente);
	}

	@Override
	public void actualizar(Cliente cliente) {
		repository.saveAndFlush(cliente);
	}

	@Override
	public void eliminar(Integer idCliente) {
		repository.deleteById(idCliente);
	}

}
