package tk.lvicenteaa.librocampo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import tk.lvicenteaa.librocampo.entities.PlanFertilizante;

@Repository
public interface PlanFertilizanteRepository extends JpaRepository<PlanFertilizante, Long> {

}
