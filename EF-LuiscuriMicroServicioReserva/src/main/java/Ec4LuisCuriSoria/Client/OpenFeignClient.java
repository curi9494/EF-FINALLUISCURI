package Ec4LuisCuriSoria.Client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;



@FeignClient(name = "idat-Turista", url="localhost:8080")
public interface OpenFeignClient {
	
	@GetMapping("/Turista/v1/listar")
	public List<Turista> listarTuristaSeleccionados();

}
