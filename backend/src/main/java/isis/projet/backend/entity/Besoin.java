package isis.projet.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Besoin extends Circuit {

    private Boolean urgent;
    private Boolean conducteur;
    private Integer nbreDemandes;
    @ManyToOne
    private Utilisateur demandeur;

}