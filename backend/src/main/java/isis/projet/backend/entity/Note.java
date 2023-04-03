package isis.projet.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Note {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private Integer valeur;
    @ManyToOne
    private Utilisateur noteur;
    @ManyToOne
    private Utilisateur notee;

}
