/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employe;

/**
 *
 * @author USER
 */
public class Salaires {
    public static void main(String[] args) {
        Personnel p = new Personnel();
        
        p.ajouterEmploye(new Vendeur(" Thibaut ", " Alida ", 23, " 16AO52T ", " 2015 ", 9500000));
        p.ajouterEmploye(new Representant(" Sosthene ", " Bekon ", 61, " 16B345T "," 2016 ", 1525000));
        p.ajouterEmploye(new Technicien("Asra ", "Frederic ", 54, " 2008 ", 456000));
        p.ajouterEmploye(new Manutentionnaire(" May ", " Beta ", 22, " 06S765F "," 2018 ", 782550));
        p.ajouterEmploye(new TechnARisque(" Nido ", " Medard ", " QV125TV ", 30, " 2000 ", 106456));
        p.ajouterEmploye(new ManutARisque(" Lait ", " Jotham ", 20, " 235T78OP ", " 2001 ", 45900));
        
        p.afficherSalaires();
        System.out.println(" Le salaire moyen dans l'entreprise est de:  " + p.salaireMoyen() + "francs.");
    } 
    
}
