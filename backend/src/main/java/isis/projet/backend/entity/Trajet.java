package isis.projet.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Trajet extends Circuit {
    private Integer nbplace;
    @ManyToOne
    private Utilisateur conducteur;
}
