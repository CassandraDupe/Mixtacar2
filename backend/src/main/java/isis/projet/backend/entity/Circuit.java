package isis.projet.backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Circuit {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private Integer depart;
    private Integer arrivee;
    private Date horaire;
    @ManyToMany(mappedBy ="circuitArrivee")
    private List<Arret> arretArrivee;
    @ManyToMany(mappedBy ="circuitDepart")
    private List<Arret> arretDepart;
}