package controller;
import model.Directeur;
import model.IPersonne;

public class EnterpriseController {
    public IPersonne[] Personnels = new IPersonne[7];

    public String ajouterDirecteur(String nom, String prenom, float portefeuille){
        Personnels[0]  = new Directeur(nom, prenom, portefeuille);
        return "Ok";
    }

    public String listerPersonnel(){
        String retMsg = "";
        for (IPersonne pers: Personnels) {
            if(pers != null) {
                retMsg += pers.toString();
            }
        }
        return retMsg;
    }
}

