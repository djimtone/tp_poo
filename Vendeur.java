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
public class Vendeur extends Commercial {
    private final static double POURCENTAGEVENDEUR=0.2;
    private final static int BONUSVENDEUR=100;
    public Vendeur(String prenom, String nom, int age, String matricule, String date, double chiffreAffaire) {
        super(prenom, nom, matricule, age, date, chiffreAffaire);
        
    }
    public double calculerSalaire() {
        return(POURCENTAGEVENDEUR * getChiffreAffaire()) + BONUSVENDEUR;
        
    }
    public String getTitre() {
        return " Le vendeur ";
        
    }
}
