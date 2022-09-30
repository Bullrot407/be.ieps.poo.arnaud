package controller;
import model.*;

import javax.swing.table.TableCellEditor;

public class EnterpriseController {
    public Personne[] TabPersonnels = new Personne[7];

    public void ajouterDirecteur(String nom, String prenom, float portefeuille){
        TabPersonnels[0]  = new Directeur(nom,prenom,portefeuille);

    }
    public void ajouterPersonne(String nom, String prenom,String profession){

        switch (profession){
            case "Contremaitre": TabPersonnels[1] = new Contremaitre(nom,prenom,profession);
            case "Comptable" : TabPersonnels[2] = new Comptable(nom,prenom,profession);
            case "Macon" : TabPersonnels[3] = new Macon(nom,prenom,profession);
            case "MaconQualifie" :TabPersonnels[4]  = new MaconQualifie(nom,prenom,profession);
            case "Manoeuvre" : TabPersonnels[5]  = new Manoeuvre(nom,prenom,profession);
            case "Secretaire" : TabPersonnels[6]  = new Secretaire(nom,prenom,profession);
        }
    }

    public void listerPersonnel(Personne[] personnels){

        for(Personne personne : TabPersonnels)
        {
            System.out.println(personne.toString());
        }

    }
}

