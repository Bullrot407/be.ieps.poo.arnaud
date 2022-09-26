package model;

public class Contremaitre extends Personne{

    public Contremaitre(String nom, String prenom, String profession) {
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
