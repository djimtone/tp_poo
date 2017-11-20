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
public class Manutentionnaire extends Employe {
    private final static double SALAIRE_HORAIRE = 65.0;
    private int heures;
    
    public Manutentionnaire(String prenom, String nom,int age, String matricule, String date, int heures){
        super(prenom, nom, age, date);
        this.heures=heures;
        
    }
    public double calculerSalaire() {
        return SALAIRE_HORAIRE * heures;
    }
    public String getTitre() {
        return " Le manutentionnaire ";
    }
}
