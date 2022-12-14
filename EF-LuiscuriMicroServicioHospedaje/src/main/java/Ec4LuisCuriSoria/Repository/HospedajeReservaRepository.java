package Ec4LuisCuriSoria.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Ec4LuisCuriSoria.Model.HospedajeDetalle;

@Repository
public interface HospedajeReservaRepository extends JpaRepository<HospedajeDetalle, Integer> {

}
