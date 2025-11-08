package tn.esprit.foyer.services;

import tn.esprit.foyer.entities.Bloc;

import java.util.List;

public interface IBlocService {

    public Bloc addBloc(Bloc bloc);
    public Bloc updateBloc(Bloc bloc);
    public void deleteBloc(Bloc bloc);
    public List<Bloc> getAllBlocs();
    public Bloc getBloc(int id);



}
