package idat.EC3.WilliamAugustoHernandezSirlupu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.EC3.WilliamAugustoHernandezSirlupu.model.Hospital;
import idat.EC3.WilliamAugustoHernandezSirlupu.repository.HospitalRepository;

@Service
public class HospitalServiceImp implements HospitalService {

	@Autowired
	private HospitalRepository repository;
	
	@Override
	public List<Hospital> lista() {
		return repository.findAll();
	}

	@Override
	public Hospital obtener(Integer idHospital) {
		return repository.findById(idHospital).orElse(null);
	}

	@Override
	public void guardar(Hospital hospital) {
		repository.save(hospital);

	}

	@Override
	public void actualizar(Hospital hospital) {
		repository.saveAndFlush(hospital);

	}

	@Override
	public void eliminar(Integer idHospital) {
		repository.deleteById(idHospital);

	}

}
