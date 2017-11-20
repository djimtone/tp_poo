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
public class ManutARisque extends Manutentionnaire implements ARisque {
    public ManutARisque(String prenom, String nom, int age, String matricule, String date, int heures) {
        super(prenom, nom, age, matricule, date, heures);
    }
    public double calculerSalaire() {
        return super.calculerSalaire() + PRIME;
        
    }
}
