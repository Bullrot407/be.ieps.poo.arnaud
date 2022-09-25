import controller.EnterpriseController;
import model.Comptable;
import model.Directeur;
import model.IPersonne;

public class Main {
    public static void main(String[] args) {

        EnterpriseController ctl = new EnterpriseController();
        System.out.println(ctl.listerPersonnel());
        System.out.println(ctl.ajouterDirecteur("Boss", "Jean", (float) 6541.21));
        System.out.println(ctl.listerPersonnel());
        IPersonne boss = new Directeur("Boss", "Jean", (float) 6541.21);
        IPersonne comptable = new Comptable("Compte", "Jean");
        System.out.println(boss.travail());
        System.out.println(comptable.travail());
    }
}