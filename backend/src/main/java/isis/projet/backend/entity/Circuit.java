package isis.projet.backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
// Essayez les autres stratégies de mise en oeuvre de l'héritage
// Attention : avec les 2 stratégies suivantes, on ne peut pas utiliser
// @GeneratedValue pour la clé
// @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
// @Inheritance(strategy = InheritanceType.JOINED)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Circuit {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private Date horaire;
    @ManyToOne
    private Arret arretArrivee;
    @ManyToOne
    private Arret arretDepart;
}