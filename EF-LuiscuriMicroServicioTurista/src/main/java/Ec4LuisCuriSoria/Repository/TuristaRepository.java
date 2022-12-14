package Ec4LuisCuriSoria.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Ec4LuisCuriSoria.Model.Turista;
@Repository
public interface TuristaRepository  extends JpaRepository<Turista, Integer> {

}
