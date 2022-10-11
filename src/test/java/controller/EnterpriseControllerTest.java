package controller;

import model.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnterpriseControllerTest {
    EnterpriseController entCont;
    @BeforeEach
            void entrepriseControler(){
        entCont = new EnterpriseController();
    }





    @BeforeAll
    void testFactory(){

        Factory factory = new Factory();
        Personne[] tabPers = new Personne[7];

        tabPers[0] = factory.getPersonne("Directeur");
        tabPers[0].setPrenom("Jean");
        tabPers[1] = factory.getPersonne("maçon");


    }




















    @Test
    void ajouterDirecteur() {
        //verifie si tableau existe
        assertNotNull(entCont.TabPersonnels);


        entCont.ajouterDirecteur("Boss", "Jean",1520);
        //vérifie si c'est bien un directeur qui est ajouté en 0
        assertEquals( Directeur.class, entCont.TabPersonnels[0].getClass() );

        assertEquals(entCont.TabPersonnels[0].profession,"Directeur");
        assertEquals(entCont.TabPersonnels[0].nom,"Boss");
        assertEquals(entCont.TabPersonnels[0].prenom,"Jean");
        assertEquals(((Directeur)entCont.TabPersonnels[0]).porteFeuille, 1520);
        //verifie si la valeur existe dans tableau
        assertNotNull(entCont.TabPersonnels[0]);
        assertTrue(entCont.TabPersonnels.length > 0);
        assertEquals(7, entCont.TabPersonnels.length);

    }

    int i;
    @Test

    void ajouterPersonne() {
        assertNotNull(entCont.TabPersonnels);

        entCont.ajouterPersonne("Pol", "Mirabelle","Contremaitre");
        assertEquals( Contremaitre.class, entCont.TabPersonnels[1].getClass() );
        entCont.ajouterPersonne("Finance", "Michel","Comptable");
        assertEquals( Comptable.class, entCont.TabPersonnels[2].getClass() );
        entCont.ajouterPersonne("Mur", "Jean", "Macon");
        assertEquals( Macon.class, entCont.TabPersonnels[3].getClass() );
        entCont.ajouterPersonne("Beaumur", "Albert", "MaconQualifie");
        assertEquals( MaconQualifie.class, entCont.TabPersonnels[4].getClass() );
        entCont.ajouterPersonne("Conduit", "Kevin","Manoeuvre");
        assertEquals( Manoeuvre.class, entCont.TabPersonnels[5].getClass() );
        entCont.ajouterPersonne("Ecrit", "Arnaud", "Secretaire");
        assertEquals( Secretaire.class, entCont.TabPersonnels[6].getClass() );

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

        for(i=1;i<6;i++) {
            assertNotNull(entCont.TabPersonnels[i]);
        }
        assertTrue(entCont.TabPersonnels.length > 0);
        assertEquals(7, entCont.TabPersonnels.length);
        }

    @Test
    void listerPersonnel() {
    }
}