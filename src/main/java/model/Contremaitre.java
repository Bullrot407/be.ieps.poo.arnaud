package model;

public class Contremaitre extends Personne{

    public Contremaitre(String nom, String prenom, String profession) {
        super(nom, prenom, profession);
    }

    public Contremaitre() {

    }

    @Override
    public String travail() {
        return "Battre les Jedi!!! " ;
    }

    @Override
    public String loisir() {
        return " Allez au cinéma !";
    }
}
