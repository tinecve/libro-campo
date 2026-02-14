package tk.lvicenteaa.librocampo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import tk.lvicenteaa.librocampo.entities.Propietario;

@Repository
public interface PropietarioRepository extends JpaRepository<Propietario, Long> {

}
