package model;

public abstract class Personne implements IPersonne {

    public String nom;
    public String prenom;
    public String profession;

    @Override
    public String toString() {
        return "model.Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", profession='" + profession + '\'' +
                '}';
    }


    public Personne(String nom, String prenom, String profession) {
        this.nom = nom;
        this.prenom = prenom;
        this.profession = profession;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

}
