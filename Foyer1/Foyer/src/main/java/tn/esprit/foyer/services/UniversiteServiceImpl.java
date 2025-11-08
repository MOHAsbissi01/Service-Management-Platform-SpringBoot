package tn.esprit.foyer.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyer.entities.Universite;
import tn.esprit.foyer.repositories.UniversiteRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteServiceImpl implements IUniversiteService {

    private final UniversiteRepository unirep;

    @Override
    public Universite addUniversite(Universite universite) {
        return unirep.save(universite);
    }

    @Override
    public Universite updateUniversite(Universite universite) {
        return unirep.save(universite);
    }

    @Override
    public Universite deleteUniversite(Universite universite) {
         unirep.delete(universite);
        return universite;
    }

    @Override
    public List<Universite> getAllUniversites() {
        return unirep.findAll();
    }

    @Override
    public Universite getUniversite(Long idUniversite) {
        return unirep.findById(idUniversite).orElse(null);
    }

    @Override
    public List<Universite> addAllUniversites(List<Universite> universites) {
        return unirep.saveAll(universites);
    }

    @Override
    public Universite getUniversiteByFoyerCapacity(Long capaciteFoyer) {
        return unirep.findByFoyer_CapaciteFoyer(capaciteFoyer);
    }
}
