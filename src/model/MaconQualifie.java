package model;

public class MaconQualifie extends Personne{

    public MaconQualifie(String nom, String prenom, String profession) {
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
