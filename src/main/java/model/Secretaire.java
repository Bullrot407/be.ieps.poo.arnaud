package model;

public class Secretaire extends Personne{

    public Secretaire(String nom, String prenom, String profession) {
        super(nom, prenom, profession);
    }

    public Secretaire() {

    }

    @Override
    public String travail() {
        return "Je dois faire les tris des documents! " ;
    }

    @Override
    public String loisir() {
        return "j'ecrit un roman!";
    }
}
