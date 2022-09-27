package controller;
import model.*;

import javax.swing.table.TableCellEditor;

public class EnterpriseController {
    public Personne[] TabPersonnels = new Personne[7];

    public void ajouterDirecteur(){
        TabPersonnels[0]  = new Directeur("Jean", "Boss",1520);

    }
    public void ajouterPersonne(){
        TabPersonnels[1]  = new Contremaitre("Pol", "Mirabelle","Contremaitre");
        TabPersonnels[2]  = new Comptable("Finance", "Michel","Comptable");
        TabPersonnels[3]  = new Macon("Mur", "Jean", "Macon");
        TabPersonnels[4]  = new MaconQualifie("Beaumur", "Albert", "MaconQualifie");
        TabPersonnels[5]  = new Manoeuvre("Conduit", "Kevin","Manoeuvre");
        TabPersonnels[6]  = new Secretaire("Ecrit", "Arnaud", "Secrétaire");

    }

    public void listerPersonnel(Personne[] personnels){

        for(Personne personne : TabPersonnels)
        {
            System.out.println(personne.toString());
        }

    }
}

