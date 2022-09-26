package model;

public class Manoeuvre extends Personne{

    public Manoeuvre(String nom, String prenom, String profession) {
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
