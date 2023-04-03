package isis.projet.backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Utilisateur {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private String nom;
    private String prenom;
    private String adresseMail;
    private String mdp;
    private String descript;
    @OneToMany(mappedBy = "notee")
    private List<Note> notesRecues;
    @OneToMany(mappedBy = "noteur")
    private List<Note> notesDonnees;
     @OneToMany(mappedBy ="concerne")
     private List<Preference> preferences;
     @OneToMany(mappedBy ="conducteur")
     private List<Trajet> trajet;
     @OneToMany(mappedBy ="demandeur")
     private List<Besoin> besoin;
    @OneToMany(mappedBy = "recepteur")
    private List<Message> messageRecu;
    @OneToMany(mappedBy = "envoyeur")
    private List<Message> messageEnvoye;
    @OneToOne
    private Messagerie messagerie;

}