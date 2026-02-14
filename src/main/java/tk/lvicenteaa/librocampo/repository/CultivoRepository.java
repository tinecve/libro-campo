package tk.lvicenteaa.librocampo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import tk.lvicenteaa.librocampo.entities.Cultivo;

@Repository
public interface CultivoRepository extends JpaRepository<Cultivo, Long> {

}
