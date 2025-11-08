package tn.esprit.foyer.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.List;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant ;
    private String nomEt  ;
    private String prenomEt ;
    private long cin;
    private String ecole;
    private Date dateNaissance ;

    @ManyToMany(mappedBy = "etudiants")
    private List<Reservation> reservations;

}

