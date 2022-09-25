package model;

public class Comptable extends Personne{


    public Comptable(String nom, String prenom) {
        super(nom, prenom, "model.Comptable");
    }

    @Override
    public String toString() {
        return "model.Comptable{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", profession='" + profession + '\'' +
                '}';
    }

    @Override
    public String travail() {
        return "J'aime compter les sous! " ;
    }

    @Override
    public String loisir() {
        return "j'aime jouer au monopoly !";
    }
}
