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
public abstract class Commercial extends Employe {
    private double chiffreAffaire;
    
    public Commercial(String prenom, String nom,String matricule, int age, String date, double chiffreAffaire) {
      super(prenom, nom, age, date);
      this.chiffreAffaire=chiffreAffaire;
      
    }
    public double getChiffreAffaire() {
        return chiffreAffaire;
        
    }
    
}
