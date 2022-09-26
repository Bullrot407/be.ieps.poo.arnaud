import controller.*;
import model.*;
public class Main {
    public static void main(String[] args) {

        EnterpriseController ctl = new EnterpriseController();
        ctl.ajouterDirecteur();
        ctl.ajouterPersonne();
        ctl.listerPersonnel(ctl.TabPersonnels);



    }
}