package idat.EC3.WilliamAugustoHernandezSirlupu.service;

import java.util.List;

import idat.EC3.WilliamAugustoHernandezSirlupu.model.Hospital;

public interface HospitalService {
	
	List<Hospital> lista();
	Hospital obtener(Integer idHospital);
	void guardar(Hospital hospital);
	void actualizar(Hospital hospital);
	void eliminar(Integer idHospital);

}
