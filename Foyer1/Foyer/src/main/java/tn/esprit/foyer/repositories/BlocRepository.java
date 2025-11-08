package tn.esprit.foyer.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyer.entities.Bloc;
@Repository
public interface BlocRepository  extends CrudRepository<Bloc, Long> {
}
