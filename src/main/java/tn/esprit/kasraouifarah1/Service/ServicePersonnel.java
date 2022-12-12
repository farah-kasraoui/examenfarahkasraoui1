package tn.esprit.kasraouifarah1.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.kasraouifarah1.Entities.Personnel;
import tn.esprit.kasraouifarah1.Entities.Zone;
import tn.esprit.kasraouifarah1.Repositories.RepositoryPersonnel;
import tn.esprit.kasraouifarah1.Repositories.RepositoryZone;

@Service
public class ServicePersonnel implements IServicePersonnel {
    @Autowired
    RepositoryPersonnel repositoryPersonnel;
   @Autowired
    RepositoryZone repositoryZone;
    @Override
    public Personnel ajouterPersonnel(Personnel personnel) {
        return repositoryPersonnel.save(personnel);
    }

    @Override
    public void affecterPersonnelZone(int idZone, int idGarde) {
      Zone zone=  repositoryZone.findById(idZone).orElse(null);
      Personnel personnel=repositoryPersonnel.findById(idGarde).orElse(null);
      if (zone!=null&&personnel!=null){
          personnel.setZone1(zone);
          repositoryPersonnel.save(personnel);
      }

    }
}
