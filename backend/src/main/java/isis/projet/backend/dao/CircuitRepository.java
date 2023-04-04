package isis.projet.backend.dao;

import isis.projet.backend.entity.Circuit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CircuitRepository extends JpaRepository<Circuit, Integer> {
}
