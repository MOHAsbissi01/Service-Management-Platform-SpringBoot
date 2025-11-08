package tn.esprit.foyer.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
//@Table(name ="f")// changer nom de la classe

public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;
   // @Column(unique =true , nullable=false , length =20) // specificité des colonnes
    private String nomFoyer;

    private Long capaciteFoyer;
    @Temporal(TemporalType.TIME)
    private Date d;

    @OneToOne(mappedBy="foyer")
    private Universite universite;

    @OneToMany (mappedBy="foyer")
    private List<Bloc> blocs;
}

