package Ec4LuisCuriSoria.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Ec4LuisCuriSoria.Client.OpenFeignClient;
import Ec4LuisCuriSoria.DTO.Turista;
import Ec4LuisCuriSoria.Model.Reserva;
import Ec4LuisCuriSoria.Model.ReservaDetalle;
import Ec4LuisCuriSoria.Model.ReservaHospedajeFK;
import Ec4LuisCuriSoria.Repository.ReservaRepository;
import Ec4LuisCuriSoria.Repository.ReservaTuristaRepository;


@Service
public class ReservaServiceImpl implements ReservaService {
	
	@Autowired
	private ReservaRepository repository;
	
	@Autowired
	private ReservaTuristaRepository repositoryDetalle;
	
	
	@Autowired
	private OpenFeignClient feign;
	
	@Override
	public List<Reserva> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Reserva ObtenerId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	@Override
	public void guardar(Reserva Reserva) {
		// TODO Auto-generated method stub
		repository.save(Reserva);

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);

	}

	@Override
	public void actualizar(Reserva Reserva) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(Reserva);

	}

	@Override
	public void asignarReservaTurista() {
		
		ReservaHospedajeFK fk= null;
		ReservaDetalle detalle = null;
		
	}

	@Override
	public void asignarTuristaReserva() {
		// TODO Auto-generated method stub
		
	}
		
		
}
