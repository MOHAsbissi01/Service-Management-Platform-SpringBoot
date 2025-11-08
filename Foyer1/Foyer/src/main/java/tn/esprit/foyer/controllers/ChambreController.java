package tn.esprit.foyer.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer.entities.Chambre;
import tn.esprit.foyer.services.IChambreService;

import java.util.List;

@RestController
@RequestMapping("/chambre")
public class ChambreController {
    @Autowired
    IChambreService ichservice;

    @GetMapping("/listerChambres") //""path vers la methode//sans parametre
    public List<Chambre> listDeChambre(){
        return ichservice.getAllChambres();
    }

    @GetMapping("/getChambre/{id}")//avec parametre
    public Chambre chambreById(@PathVariable  Long id){  //id nfs l fl {} fl getmapping sinon ca beugue //pour objet
        return ichservice.getChambre(id);
    }
    @PostMapping("/addChambre")
    public Chambre addChambre(@RequestBody Chambre chambre){//pour liste
        return ichservice.addChambre(chambre);
    }
    @DeleteMapping("/deleteChambre{id}")
    public void deleteChambre(@PathVariable Long id){};


    @PostMapping ("/updateChambre")
    public Chambre updateChambre(@RequestBody Chambre chambre){
        return ichservice.UpdateChambre(chambre);
    }
    @PostMapping("/addListChambre")
    public List<Chambre> addListChambre(@RequestBody List<Chambre> list){
        return ichservice.addAllChambres(list);
    }

    @GetMapping("/getByNum/{num}")
    public Chambre getChambreByNum(@PathVariable Long num){
        return ichservice.getChambreSelonNumero(num);
    }
}
