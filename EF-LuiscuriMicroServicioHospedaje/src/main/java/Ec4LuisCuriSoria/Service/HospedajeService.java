package Ec4LuisCuriSoria.Service;

import java.util.List;

import Ec4LuisCuriSoria.Model.Hospedaje;



public interface HospedajeService {
	

	List<Hospedaje> listar();
	Hospedaje ObtenerId(Integer id);	
	void guardar(Hospedaje Hospedaje);
	void eliminar(Integer id);
	void actualizar(Hospedaje Hospedaje);
	
	void asignarReservaHospedaje();

}
