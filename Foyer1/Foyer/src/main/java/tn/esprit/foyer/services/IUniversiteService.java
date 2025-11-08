package tn.esprit.foyer.services;

import tn.esprit.foyer.entities.Universite;

import java.util.List;

public interface IUniversiteService {

    Universite addUniversite(Universite universite);
    Universite updateUniversite(Universite universite);
    Universite deleteUniversite(Universite universite);
    List<Universite> getAllUniversites();
    Universite getUniversite(Long idUniversite);

    List<Universite> addAllUniversites(List<Universite> universites);
    Universite getUniversiteByFoyerCapacity(Long capaciteFoyer);
}
