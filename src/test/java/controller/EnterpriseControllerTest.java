package controller;

import model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnterpriseControllerTest {

    @Test
    void ajouterDirecteur() {
        EnterpriseController entCont = new EnterpriseController();
        entCont.ajouterDirecteur("Boss", "Jean",1520);
        assertEquals(entCont.TabPersonnels[0].profession,"Directeur");
        assertEquals(entCont.TabPersonnels[0].nom,"Boss");
        assertEquals(entCont.TabPersonnels[0].prenom,"Jean");
        assertEquals(((Directeur)entCont.TabPersonnels[0]).porteFeuille, 1520);
    }


    @Test
    void ajouterPersonne() {
        EnterpriseController entCont = new EnterpriseController();
        entCont.ajouterPersonne("Pol", "Mirabelle","Contremaitre");
        entCont.ajouterPersonne("Finance", "Michel","Comptable");
        entCont.ajouterPersonne("Mur", "Jean", "Macon");
        entCont.ajouterPersonne("Beaumur", "Albert", "MaconQualifie");
        entCont.ajouterPersonne("Conduit", "Kevin","Manoeuvre");
        entCont.ajouterPersonne("Ecrit", "Arnaud", "Secretaire");

        assertEquals(entCont.TabPersonnels[1].profession,"Contremaitre");
        assertEquals(entCont.TabPersonnels[1].nom,"Pol");
        assertEquals(entCont.TabPersonnels[1].prenom,"Mirabelle");

        assertEquals(entCont.TabPersonnels[2].profession,"Comptable");
        assertEquals(entCont.TabPersonnels[2].nom,"Finance");
        assertEquals(entCont.TabPersonnels[2].prenom,"Michel");

        assertEquals(entCont.TabPersonnels[3].profession,"Macon");
        assertEquals(entCont.TabPersonnels[3].nom,"Mur");
        assertEquals(entCont.TabPersonnels[3].prenom,"Jean");

        assertEquals(entCont.TabPersonnels[4].profession,"MaconQualifie");
        assertEquals(entCont.TabPersonnels[4].nom,"Beaumur");
        assertEquals(entCont.TabPersonnels[4].prenom,"Albert");

        assertEquals(entCont.TabPersonnels[5].profession,"Manoeuvre");
        assertEquals(entCont.TabPersonnels[5].nom,"Conduit");
        assertEquals(entCont.TabPersonnels[5].prenom,"Kevin");

        assertEquals(entCont.TabPersonnels[6].profession,"Secretaire");
        assertEquals(entCont.TabPersonnels[6].nom,"Ecrit");
        assertEquals(entCont.TabPersonnels[6].prenom,"Arnaud");
        }

    @Test
    void listerPersonnel() {
    }
}