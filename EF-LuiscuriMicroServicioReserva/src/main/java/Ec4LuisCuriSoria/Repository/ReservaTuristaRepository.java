package Ec4LuisCuriSoria.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Ec4LuisCuriSoria.Model.ReservaDetalle;


@Repository
public interface ReservaTuristaRepository extends JpaRepository<ReservaDetalle, Integer> {

}
