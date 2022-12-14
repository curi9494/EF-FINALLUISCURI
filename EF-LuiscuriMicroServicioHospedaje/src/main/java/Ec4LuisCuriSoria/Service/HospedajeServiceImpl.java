package Ec4LuisCuriSoria.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ec4LuisCuriSoria.Client.OpenFeignHospedaje;
import Ec4LuisCuriSoria.Model.Hospedaje;
import Ec4LuisCuriSoria.Model.HospedajeDetalle;
import Ec4LuisCuriSoria.Model.HospedajaeReservaFK;
import Ec4LuisCuriSoria.Repository.HospedajeReservaRepository;
import Ec4LuisCuriSoria.Repository.HospedajeRepository;

@Service
public class HospedajeServiceImpl implements HospedajeService {
	
	@Autowired
	private HospedajeRepository repository;
	
	@Autowired
	private HospedajeReservaRepository repositoryDetalle;
	
	@Autowired
	private OpenFeignHospedaje feign;

	@Override
	public List<Hospedaje> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Hospedaje ObtenerId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	@Override
	public void guardar(Hospedaje Hospedaje) {
		// TODO Auto-generated method stub
		repository.save(Hospedaje);

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);

	}

	@Override
	public void actualizar(Hospedaje Hospedaje) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(Hospedaje);

	}

	@Override
	public void asignarReservaHospedaje() {
		
		
		HospedajaeReservaFK fk= null;
		HospedajeDetalle detalle = null;
		
		
		
	}

}
