import controller.*;
import model.*;
public class Main {
    public static void main(String[] args) {

        EnterpriseController ctl = new EnterpriseController();

        System.out.println(ctl.listerPersonnel());
        System.out.println(ctl.ajouterDirecteur("Boss", "Jean", (float) 6541.21));
        System.out.println(ctl.listerPersonnel());
        IPersonne boss = new Directeur("Boss", "Jean", (float) 6541.21);


    }
}