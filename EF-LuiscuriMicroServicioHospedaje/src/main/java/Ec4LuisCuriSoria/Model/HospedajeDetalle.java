package Ec4LuisCuriSoria.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Hospedaje_Reserva")
public class HospedajeDetalle {
	
	@Id
	private HospedajaeReservaFK fk= new HospedajaeReservaFK();

}
