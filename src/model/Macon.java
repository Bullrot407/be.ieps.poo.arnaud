package model;

public class Macon extends Personne{

    public Macon(String nom, String prenom, String profession) {
        super(nom, prenom, profession);
    }

    @Override
    public String travail() {
        return null;
    }

    @Override
    public String loisir() {
        return null;
    }
}
