package model;

public class MaconQualifie extends Personne{

    public MaconQualifie(String nom, String prenom, String profession) {
        super(nom, prenom, profession);
    }

    @Override
    public String travail() {
        return "je regarde le macon :) " ;
    }

    @Override
    public String loisir() {
        return "j'aime jouer avec le macon aux Lego !";
    }
}
