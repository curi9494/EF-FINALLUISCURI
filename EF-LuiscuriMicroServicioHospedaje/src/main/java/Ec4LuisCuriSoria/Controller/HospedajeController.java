package Ec4LuisCuriSoria.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import Ec4LuisCuriSoria.Model.Hospedaje;
import Ec4LuisCuriSoria.Service.HospedajeService;

@Controller
@RequestMapping("/Hospedaje/v1")
public class HospedajeController {
	
	@Autowired
	private HospedajeService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<Hospedaje> listar(){
		return service.listar();
	}
	
	@GetMapping("/listar/{id}")
	public @ResponseBody Hospedaje obtener(@PathVariable Integer id){
		return service.ObtenerId(id);
	}
	
	@PostMapping("/guardar")
	public ResponseEntity<Void>  guardar(@RequestBody Hospedaje Hospedaje) {
		service.guardar(Hospedaje);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@PutMapping("/actualizar")
	public @ResponseBody void actualizar(@RequestBody Hospedaje Hospedaje) {
		service.actualizar(Hospedaje);
	}
	
	
	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable Integer id){
		
		Hospedaje Hospedaje= service.ObtenerId(id);
		if(Hospedaje != null) {
			service.eliminar(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}		
		
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
	}
	
	@GetMapping("/asignar")
	public @ResponseBody void asignarReservaHospedaje() {
		service.asignarReservaHospedaje(); 
		
	}

	

}
