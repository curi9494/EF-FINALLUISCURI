package Ec4LuisCuriSoria.Service;

import java.util.List;

import Ec4LuisCuriSoria.Model.Turista;

public interface TuristaService {
	List<Turista> listar();
	Turista ObtenerId(Integer id);	
	void guardar(Turista Turista);
	void eliminar(Integer id);
	void actualizar(Turista Turista);	

}
