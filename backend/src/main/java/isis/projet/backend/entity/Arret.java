package isis.projet.backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Arret {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private String nom;
    private Double lat;
    private Double lon;
    @ManyToMany(mappedBy ="arretArrivee")
    private List<Circuit> circuitArrivee;
    @ManyToMany(mappedBy ="arretDepart")
    private List<Circuit> circuitDepart;
}
