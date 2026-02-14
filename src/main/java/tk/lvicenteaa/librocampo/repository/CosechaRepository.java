package tk.lvicenteaa.librocampo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import tk.lvicenteaa.librocampo.entities.Cosecha;

@Repository
public interface CosechaRepository extends JpaRepository<Cosecha, Long> {

}
