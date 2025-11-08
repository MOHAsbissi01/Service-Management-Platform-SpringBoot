package tn.esprit.foyer.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyer.entities.Universite;
@Repository
public interface UniversiteRepository extends CrudRepository<Universite, Long > {
}
