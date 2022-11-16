package idat.EC3.WilliamAugustoHernandezSirlupu.service;

import java.util.List;

import idat.EC3.WilliamAugustoHernandezSirlupu.model.Usuariocliente;

public interface UsuarioClienteService {
	
	List<Usuariocliente> lista();
	Usuariocliente obtener(Integer idUsuariocliente);
	void guardar(Usuariocliente usuariocliente);
	void actualizar(Usuariocliente usuariocliente);
	void eliminar(Integer idUsuariocliente);

}
