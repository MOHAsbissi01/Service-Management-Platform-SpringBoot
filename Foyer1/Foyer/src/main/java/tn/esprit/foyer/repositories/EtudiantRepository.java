package tn.esprit.foyer.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyer.entities.Etudiant;
@Repository
public interface EtudiantRepository extends CrudRepository<Etudiant,Long> {
}
