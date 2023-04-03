package isis.projet.backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Message {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private String type;
    private String contenu;
    private Date envoi;
    @ManyToOne
    private Utilisateur envoyeur;
    @ManyToOne
    private Utilisateur recepteur;
    @ManyToOne
    private Conversation conversation;
}
