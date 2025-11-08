package tn.esprit.foyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyer.entities.Universite;

public interface UniversiteRepository extends JpaRepository<Universite, Long> {
    Universite findByFoyer_CapaciteFoyer(Long capaciteFoyer);
}
