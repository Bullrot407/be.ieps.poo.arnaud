package model;

public class Factory {

   public Personne getPersonne(String profession) {
       if (profession == null) {
           return null;
       }
       if (profession.equalsIgnoreCase("directeur")) {
           return new Directeur();

       } else if (profession.equalsIgnoreCase("comptable")) {
           return new Comptable();

       } else if (profession.equalsIgnoreCase("contremaitre")) {
           return new Contremaitre();
       } else if (profession.equalsIgnoreCase("maçon")) {
           return new Macon();
       } else if (profession.equalsIgnoreCase("maçon qualifié")) {
           return new MaconQualifie();
       } else if (profession.equalsIgnoreCase("manoeuvre")) {
           return new Manoeuvre();
       } else if (profession.equalsIgnoreCase("secretaire")) {
           return new Secretaire();
       }
       return null;
   }
}
