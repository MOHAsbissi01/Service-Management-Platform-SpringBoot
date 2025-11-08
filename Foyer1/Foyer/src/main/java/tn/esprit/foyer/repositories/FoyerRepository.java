package tn.esprit.foyer.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyer.entities.Foyer;
@Repository
public interface FoyerRepository extends CrudRepository<Foyer, Long> {

}
