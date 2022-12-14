package Ec4LuisCuriSoria.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class HospedajaeReservaFK implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 456336806518681361L;

	@Column(name="id_Hospedaje", nullable = false, unique = true)
	private Integer idHospedaje;
	
	@Column(name="id_Reserva", nullable = false, unique = true)
	private Integer idPizza;

}
