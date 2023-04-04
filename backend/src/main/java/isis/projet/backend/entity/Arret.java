package isis.projet.backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
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
    private String lat;
    private String lon;
    @OneToMany(mappedBy ="arretArrivee")
    private List<Circuit> circuitArrivee = new ArrayList<>() ;

    //@OneToMany(mappedBy="arretDepart")
    //private List<Circuit> circuitDepart;
}
