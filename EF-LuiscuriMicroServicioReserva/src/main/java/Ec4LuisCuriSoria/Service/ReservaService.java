package Ec4LuisCuriSoria.Service;

import java.util.List;

import Ec4LuisCuriSoria.Model.Reserva;



public interface ReservaService {
	
	List<Reserva> listar();
	Reserva ObtenerId(Integer id);	
	void guardar(Reserva Reserva);
	void eliminar(Integer id);
	void actualizar(Reserva Reserva);	

	void asignarTuristaReserva();
	void asignarReservaTurista();
}
