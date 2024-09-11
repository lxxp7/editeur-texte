package fr.iut.editeur.document;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DocumentTest {

    private Document document;

    @BeforeEach
    public void setUp() {
        document = new Document();
    }

    @Test
    public void testAjouter() {
        document.ajouter("Bonjour");
        assertEquals("Bonjour", document.gettexteDocument(), "Le texte ajouté n'est pas correct");
    }

    @Test
    public void testRemplacer() {
        document.ajouter("Bonjour tout le monde");
        document.remplacer(0, 6, "Salut");
        assertEquals("Salut tout le monde", document.gettexteDocument(), "Le remplacement n'est pas correct");
    }

    @Test
    public void testMajuscules() {
        document.ajouter("bonjour");
        document.majuscules(0, 6);
        assertEquals("BONJOUR", document.gettexteDocument(), "La mise en majuscules n'est pas correcte");
    }

    @Test
    public void testMinuscules() {
        document.ajouter("BONJOUR");
        document.minuscules(0, 6);
        assertEquals("bonjour", document.gettexteDocument(), "La mise en minuscules n'est pas correcte");
    }

    @Test
    public void testInserer() {
        document.ajouter("Bonjour monde");
        document.inserer(7, " le ");
        assertEquals("Bonjour le monde", document.gettexteDocument(), "L'insertion n'est pas correcte");
    }

    @Test
    public void testEffacer() {
        document.ajouter("Bonjour tout le monde");
        document.effacer(7, 11);  // Efface "tout "
        assertEquals("Bonjour le monde", document.gettexteDocument(), "L'effacement n'est pas correct");
    }

    @Test
    public void testClear() {
        document.ajouter("Texte à effacer");
        document.clear();
        assertEquals("", document.gettexteDocument(), "Le document n'a pas été vidé correctement");
    }

}
