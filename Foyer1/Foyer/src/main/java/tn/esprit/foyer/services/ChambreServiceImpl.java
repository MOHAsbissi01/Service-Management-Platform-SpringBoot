package tn.esprit.foyer.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.foyer.entities.Chambre;
import tn.esprit.foyer.repositories.ChambreRepository;

import java.util.List;
@AllArgsConstructor
@Service
public class ChambreServiceImpl implements IChambreService {
    @Autowired// injection
    ChambreRepository chrep;//injection de dependance


    @Override
    public Chambre addChambre(Chambre chambre) {
        return chrep.save(chambre);
    }

    @Override
    public Chambre UpdateChambre(Chambre chambre) {
        return chrep.save(chambre);
    }

    @Override
    public void DeleteChambre(Long idChambre) {
        chrep.deleteById(idChambre);

    }

    @Override
    public Chambre getChambre(Long idChambre) {
        return chrep.findById(idChambre).get(); //gerer
    }

    @Override
    public List<Chambre> getAllChambres() {
        return (List<Chambre>) chrep.findAll(); //find all traja3 iterable il faut faire cast pour la rendre liste
    }

    @Override
    public List<Chambre> addAllChambres(List<Chambre> chambres) {
        return (List<Chambre>)chrep.saveAll(chambres);
    }

    @Override
    public Chambre getChambreSelonNumero(long num) {
        return chrep.findByNumeroChambre(num);
    }
}
