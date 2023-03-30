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

    @Basic
    @Column(name = "nom")
    private String nom;
    @Basic
    @Column(name = "prenom")
    private String prenom;
    @Basic
    @Column(name = "adresse_mail")
    private String adresseMail;
    @Basic
    @Column(name = "mdp")
    private String mdp;
    @Basic
    @Column(name = "descript")
    private String descript;
    @Basic
    @Column(name = "preferences")
    private Integer preferences;
    @OneToMany(mappedBy = "notee")
    private List<Note> notesRecues;
    @OneToMany(mappedBy = "noteur")
    private List<Note> notesDonnees;
    // @OneToMany(mappedBy ="utilisateursByIdpreference")
    // private Collection<Preference> preferenceByIdutilisateur;
    // @OneToMany(mappedBy ="utilisateursByIdtrajet")
    // private Collection<Trajet> trajetByIdutilisateur;
    // @OneToMany(mappedBy ="utilisateursByIdbesoin")
    // private Collection<Besoin> besoinByIdutilisateur;

}