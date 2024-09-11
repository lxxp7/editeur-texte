package fr.iut.editeur.document;

public class Document {

    private String texteDocument;

    public Document() {
        this.texteDocument = "";
    }

    /**
        * @return the texteDocument
        return the text of the document
     */
    public String gettexteDocument() {
        return texteDocument;
    }

    /**
        * @param texteDocument the texteDocument to set
        * set the text of the document
     */
    public void settexteDocument(String texteDocument) {
        this.texteDocument = texteDocument;
    }


    /**
        * @param texteDocument the texteDocument to set
        * add text to the document
     */
    public void ajouter(String texteDocument) {
        this.texteDocument += texteDocument;
    }


    /**
        * @param debut the start of the text to replace
        * @param fin the end of the text to replace
        * @param remplacement the text to replace with
        * replace the text between debut and fin with remplacement
     */
    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texteDocument.substring(0, debut);
        String partieDroite = texteDocument.substring(fin + 1);
        texteDocument = partieGauche + remplacement + partieDroite;
    }


    /**
        * @param debut the start of the text to capitalize
        * @param fin the end of the text to capitalize
        * capitalize the text between debut and fin
     */
    public void majuscules(int debut, int fin) {
        String partieGauche = texteDocument.substring(debut,fin + 1);
        remplacer(debut,fin,partieGauche.toUpperCase());
    }


    /**
        * @param position the position to insert the text
        * @param texteDocument the text to insert
        * insert the text at the given position
     */
    public void inserer(int position, String texteDocument) {
        String partieGauche = this.texteDocument.substring(0, position);
        String partieDroite = this.texteDocument.substring(position);
        this.texteDocument = partieGauche + texteDocument + partieDroite;
    }


    /**
        * @param debut the start of the text to uncapitalize
        * @param fin the end of the text to uncapitalize
        * capitalize the text between debut and fin
     */
    public void minuscules(int debut, int fin) {
        String partieGauche = texteDocument.substring(debut,fin + 1);
        remplacer(debut,fin,partieGauche.toLowerCase());
    }


    /**
        * @param start the start of the text to delete
        * @param end the end of the text to delete
        * delete the text between start and end
     */
    public void effacer(int start, int end) {
        remplacer(start,end,"");
    }


    /**
        * clear the document
     */
    public void clear() {
        texteDocument = "";
    }

    @Override
    public String toString() {
        return this.texteDocument;
    }
}
