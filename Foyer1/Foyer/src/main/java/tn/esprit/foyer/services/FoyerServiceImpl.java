package tn.esprit.foyer.services;

import tn.esprit.foyer.entities.Foyer;
import tn.esprit.foyer.repositories.FoyerRepository;

import java.util.List;
import java.util.Optional;

public class FoyerServiceImpl implements IFoyerService{
    FoyerRepository Frep;

    @Override
    public Foyer addFoyer(Foyer foyer) {
        return Frep.save(foyer);
    }

    @Override
    public Foyer UpdateFoyer(Foyer foyer) {
        return Frep.save(foyer);
    }

    @Override
    public void DeleteFoyer(Long idFoyer) {
        Frep.deleteById(idFoyer);
    }

    @Override
    public Optional<Foyer> getFoyer(Long idFoyer) {
        return Frep.findById(idFoyer);
    }

    @Override
    public List<Foyer> getAllFoyers() {
        return (List<Foyer>) Frep.findAll();
    }

    @Override
    public List<Foyer> addAllFoyers(List<Foyer> foyers) {
        return (List<Foyer>) Frep.saveAll(foyers);
    }
}
