package tn.esprit.foyer.services;

import tn.esprit.foyer.entities.Foyer;

import java.util.List;
import java.util.Optional;

public interface IFoyerService {
    public Foyer addFoyer(Foyer foyer);
    public Foyer UpdateFoyer(Foyer foyer);
    public void DeleteFoyer(Long idFoyer);
    public Optional<Foyer> getFoyer(Long idFoyer);
    public List<Foyer> getAllFoyers();
    public List<Foyer>addAllFoyers(List<Foyer> foyers);

}
