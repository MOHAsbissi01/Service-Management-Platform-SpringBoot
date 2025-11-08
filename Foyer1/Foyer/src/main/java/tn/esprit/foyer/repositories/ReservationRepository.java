package tn.esprit.foyer.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyer.entities.Reservation;
@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {
}
