package model;

public class Secretaire extends Personne{

    public Secretaire(String nom, String prenom, String profession) {
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
