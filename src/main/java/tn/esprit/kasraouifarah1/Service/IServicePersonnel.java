package tn.esprit.kasraouifarah1.Service;

import tn.esprit.kasraouifarah1.Entities.Personnel;

public interface IServicePersonnel {
    Personnel ajouterPersonnel(Personnel personnel);
    void affecterPersonnelZone(int idZone,int idGarde);
}
