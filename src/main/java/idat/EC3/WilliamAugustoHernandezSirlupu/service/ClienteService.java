package idat.EC3.WilliamAugustoHernandezSirlupu.service;

import java.util.List;

import idat.EC3.WilliamAugustoHernandezSirlupu.model.Cliente;

public interface ClienteService {
	
	List<Cliente> lista();
	Cliente obtener(Integer idCliente);
	void guardar(Cliente cliente);
	void actualizar(Cliente cliente);
	void eliminar(Integer idCliente);

}
