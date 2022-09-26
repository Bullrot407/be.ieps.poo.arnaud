package controller;
import model.*;

public class EnterpriseController {
    public Personne[] Personnels = new Personne[7];

    public String ajouterDirecteur(String nom, String prenom, float portefeuille){
        Personnels[0]  = new Directeur(nom, prenom, portefeuille);
        return "Directeur ajouter tableau";
    }
    public String ajouterPersonne(String nom, String prenom){
        Personnels[1]  = new Contremaitre(nom, prenom,"Contremaitre");
        Personnels[2]  = new Comptable(nom, prenom,"Comptable");
        Personnels[3]  = new Macon(nom, prenom, "Macon");
        Personnels[4]  = new MaconQualifie(nom, prenom, "MaconQualifie");
        Personnels[5]  = new Manoeuvre(nom, prenom,"Manoeuvre");
        Personnels[6]  = new Secretaire(nom, prenom, "Secrétaire");
        return "Ok";
    }

    public String listerPersonnel(){
        String retMsg = "";
        for (Personne pers: Personnels) {
            if(pers != null) {
                retMsg += pers.toString();
            }
        }
        return retMsg;
    }
}

