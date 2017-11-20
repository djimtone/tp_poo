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
public class Personnel {
    private Employe[] staff;
    private final static int MAXEMPLOYE = 250;
    int nbreEmploye;
    public Personnel() {
        staff = new Employe[MAXEMPLOYE];
        nbreEmploye = 0;
    }
    public void ajouterEmploye(Employe e) {
        ++nbreEmploye;
        if (nbreEmploye<=MAXEMPLOYE) {
            staff[nbreEmploye - 1]= e;
            
        }
        else {
            System.out.println("Pas plus de" + MAXEMPLOYE + "employés");
        }
    }
    public double salaireMoyen() {
        double somme = 0.0;
        for (int i =0; i< nbreEmploye; i++) {
            somme += staff[i].calculerSalaire();
        }
        return somme / nbreEmploye ;
    }
    public void afficherSalaires() {
        for (int i = 0; i< nbreEmploye; i++) {
            System.out.println(staff[i].getNom() + " gagne: " + staff[i].calculerSalaire() + "francs.");
  
        }

     }
}