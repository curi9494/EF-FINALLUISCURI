package Ec4LuisCuriSoria.Client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import Ec4LuisCuriSoria.DTO.Hospedaje;



@FeignClient(name = "idat-Hospedaje", url="localhost:8090")
public interface OpenFeignHospedaje {
	
	@GetMapping("/Hospedaje/v1/listar")
	public List<Hospedaje> listarHospedajeSeleccionados();

}
