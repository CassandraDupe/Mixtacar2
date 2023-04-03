package isis.projet.backend.dao;

import isis.projet.backend.entity.Trajet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrajetRepository extends JpaRepository<Trajet, Integer> {
}
