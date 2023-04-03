package isis.projet.backend.dao;

import isis.projet.backend.entity.Besoin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BesoinRepository extends JpaRepository<Besoin, Integer> {
}
