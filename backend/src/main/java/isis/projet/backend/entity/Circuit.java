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
    private Date horaire;
    @ManyToOne
    private Arret arretArrivee;
    @ManyToOne
    private Arret arretDepart;
}