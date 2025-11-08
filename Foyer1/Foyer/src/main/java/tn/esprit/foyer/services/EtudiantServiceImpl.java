package tn.esprit.foyer.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyer.entities.Etudiant;
import tn.esprit.foyer.repositories.EtudiantRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EtudiantServiceImpl implements IEtudiantService {
    EtudiantRepository etrep;//injection de dependance

    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return etrep.save(etudiant);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        return etrep.save(etudiant);
    }

    @Override
    public void deleteEtudiant(Long idEtudiant) {
        etrep.deleteById(idEtudiant);
    }

    @Override
    public List<Etudiant> getAllEtudiants() {
        return (List<Etudiant>) etrep.findAll();
    }

    @Override
    public Etudiant getEtudiant(long idEtudiant) {
        return etrep.findById(idEtudiant).get();
    }


    public Optional<Etudiant> getEtudiant(Long idEtudiant) {
        return etrep.findById(idEtudiant);
    }
}
