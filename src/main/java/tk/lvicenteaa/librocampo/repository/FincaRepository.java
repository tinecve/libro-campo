package tk.lvicenteaa.librocampo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import tk.lvicenteaa.librocampo.entities.Finca;

@Repository
public interface FincaRepository extends JpaRepository<Finca, Long> {

}
