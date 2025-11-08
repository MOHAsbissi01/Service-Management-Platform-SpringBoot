package tn.esprit.foyer.services;

import tn.esprit.foyer.entities.Bloc;
import tn.esprit.foyer.entities.Universite;

import java.util.List;

public interface IUniversiteService {

    public Universite addUniversite(Universite universite);
    public Universite updateUniversite(Universite universite);
    public Universite deleteUniversite(Universite universite);
    public List<Universite> getAllUniversites();
    public Universite getUniversite(int idUniversite);



}
