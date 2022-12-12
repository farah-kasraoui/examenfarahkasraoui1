package tn.esprit.kasraouifarah1.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.kasraouifarah1.Entities.Personnel;
import tn.esprit.kasraouifarah1.Service.IServicePersonnel;

@RestController

public class ControllerPersonnel {
@Autowired
    IServicePersonnel iServicePersonnel;
@PostMapping("/savep")
public Personnel ajouterPersonnel( @RequestBody Personnel personnel){
        return iServicePersonnel.ajouterPersonnel(personnel);
    }
@PutMapping("/{idZone}/{idGarde}")
    public void affecterPersonnelZone( @PathVariable int idZone, @PathVariable int idGarde){
     iServicePersonnel.affecterPersonnelZone(idZone,idGarde);
    }
}
