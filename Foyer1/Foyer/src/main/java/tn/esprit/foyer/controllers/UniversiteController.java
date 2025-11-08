package tn.esprit.foyer.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer.entities.Universite;
import tn.esprit.foyer.services.IUniversiteService;

import java.util.List;

@RestController
@RequestMapping("/Universite")
@AllArgsConstructor
public class UniversiteController {

    private final IUniversiteService iuniversiteService;

    @GetMapping("/getUniversiteByCapacityFoyer/{capacityFoyer}")
    public Universite getUniversiteByCapacityFoyer(@PathVariable Long capacityFoyer) {
        return iuniversiteService.getUniversiteByFoyerCapacity(capacityFoyer);
    }


    @GetMapping("/all")
    public List<Universite> getAll() {
        return iuniversiteService.getAllUniversites();
    }

    @GetMapping("/{id}")
    public Universite getById(@PathVariable Long id) {
        return iuniversiteService.getUniversite(id);
    }


}
