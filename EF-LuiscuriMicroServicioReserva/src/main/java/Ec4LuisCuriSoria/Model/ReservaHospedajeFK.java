package Ec4LuisCuriSoria.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;
@Data
@Embeddable
public class ReservaHospedajeFK implements Serializable{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4662828215017641363L;

	@Column(name="id_Reserva", nullable = false, unique = true)
	private Integer idReserva;
	
	@Column(name="id_Hospedaje", nullable = false, unique = true)
	private Integer idHospedaje;

}
