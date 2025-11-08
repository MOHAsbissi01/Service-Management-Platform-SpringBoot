package tn.esprit.foyer.services;

import tn.esprit.foyer.entities.Chambre;

import java.util.List;

public interface IChambreService {
    public Chambre addChambre(Chambre chambre);
    public Chambre UpdateChambre(Chambre chambre);
    public void DeleteChambre(Long idChambre);
    public Chambre getChambre(Long idChambre);
    public List<Chambre> getAllChambres();
    public List<Chambre>addAllChambres(List<Chambre> chambres);
    public Chambre getChambreSelonNumero(long num);

}
