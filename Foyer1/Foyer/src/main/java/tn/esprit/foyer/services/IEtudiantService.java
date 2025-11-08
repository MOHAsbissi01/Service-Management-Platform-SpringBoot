package tn.esprit.foyer.services;

import tn.esprit.foyer.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {

    public Etudiant addEtudiant(Etudiant etudiant);
    public Etudiant updateEtudiant(Etudiant etudiant);
    public void deleteEtudiant(Long etudiant);
    public List<Etudiant> getAllEtudiants();
    public Etudiant getEtudiant(long idEtudiant);



}
