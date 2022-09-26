package model;

public class Directeur extends Personne{

    public float porteFeuille;

    public Directeur(String nom, String prenom, float porteFeuille) {
        super(nom, prenom,"Directeur");

        this.porteFeuille = porteFeuille;
    }

    @Override
    public String toString() {
        return "Directeur =" +
                " / nom: " + nom  +
                " / prenom:  " + prenom +
                " / profession: " + profession  +
                " / porteFeuille: " + porteFeuille +
                " / Travail: " + travail() +
                " / Loisir: " + loisir();
    }

    public float getPorteFeuille() {
        return porteFeuille;
    }

    public void setPorteFeuille(float porteFeuille) {
        this.porteFeuille = porteFeuille;
    }



    @Override
    public String travail() {
        return "Je suis le Boss !!!!";
    }

    @Override
    public String loisir() {
        return "J'aime jouer à virer des gens !";
    }
}
