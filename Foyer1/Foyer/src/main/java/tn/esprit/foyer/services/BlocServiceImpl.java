package tn.esprit.foyer.services;

import tn.esprit.foyer.entities.Bloc;
import tn.esprit.foyer.repositories.BlocRepository;

import java.util.List;

public class BlocServiceImpl implements IBlocService{
    BlocRepository Brep;

    @Override
    public Bloc addBloc(Bloc bloc) {
        return Brep.save(bloc) ;
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return Brep.save(bloc);
    }

    @Override
    public void deleteBloc(Bloc bloc) {
        //Brep.deleteById(idBloc);
    }

    @Override
    public List<Bloc> getAllBlocs() {
        return List.of();
    }

    @Override
    public Bloc getBloc(int id) {
        return null;
    }
}
