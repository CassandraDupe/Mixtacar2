package isis.projet.backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Messagerie {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    @OneToOne
    private Utilisateur proprio;
    @OneToMany(mappedBy = "messagerie")
    private List<Conversation> conversation;
}
