package model;

public class Manoeuvre extends Personne{

    public Manoeuvre(String nom, String prenom, String profession) {
        super(nom, prenom, profession);
    }

    public Manoeuvre() {

    }

    @Override
    public String travail() {
        return "Je pilote les grues " ;
    }

    @Override
    public String loisir() {
        return "j'ai pas d'amis :'( !";
    }
}
