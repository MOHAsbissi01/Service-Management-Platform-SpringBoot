package tn.esprit.foyer.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyer.entities.Chambre;
@Repository
public interface ChambreRepository extends CrudRepository<Chambre, Long> {
    Chambre findByNumeroChambre(long num);
}

