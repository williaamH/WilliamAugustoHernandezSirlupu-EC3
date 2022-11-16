package idat.EC3.WilliamAugustoHernandezSirlupu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import idat.EC3.WilliamAugustoHernandezSirlupu.model.Usuariocliente;

@Repository
public interface UsuarioClienteRepository extends JpaRepository<Usuariocliente, Integer>{
	
	Usuariocliente findByUsuario(String usuario);

}
