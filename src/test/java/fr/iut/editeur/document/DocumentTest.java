package fr.iut.editeur.document;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DocumentTest {

    Document doc = new Document();


    @Test
    public void testAjout() {
        doc.ajouter("Hello, ");
        assertEquals("Hello, ",doc.getTexte());
    }

    @Test
    public void testEffacer() {
        testAjout();
        doc.effacer(5,7);
        assertEquals("Hello",doc.getTexte());
    }

    @Test
    public void testMaj() {
        testEffacer();
        doc.majuscules(0,doc.getTexte().length());
        assertEquals("HELLO",doc.getTexte());
    }

}
