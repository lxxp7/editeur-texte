package fr.iut.editeur.document;

public class Document {

    private String texteDocument;

    public Document() {
        this.texteDocument = "";
    }
	
    public String gettexteDocument() {
        return texteDocument;
    }

    public void settexteDocument(String texteDocument) {
        this.texteDocument = texteDocument;
    }

    public void ajouter(String texteDocument) {
        this.texteDocument += texteDocument;
    }

    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texteDocument.substring(0, debut);
        String partieDroite = texteDocument.substring(fin + 1);
        texteDocument = partieGauche + remplacement + partieDroite;
    }

    public void majuscules(int debut, int fin) {
        String partieGauche = texteDocument.substring(debut,fin + 1);
        remplacer(debut,fin,partieGauche.toUpperCase());
    }

    public void inserer(int position, String texteDocument) {
        String partieGauche = this.texteDocument.substring(0, position);
        String partieDroite = this.texteDocument.substring(position);
        this.texteDocument = partieGauche + texteDocument + partieDroite;
    }

    public void minuscules(int debut, int fin) {
        String partieGauche = texteDocument.substring(debut,fin + 1);
        remplacer(debut,fin,partieGauche.toLowerCase());
    }

    public void effacer(int start, int end) {
        remplacer(start,end,"");
    }

    public void clear() {
        texteDocument = "";
    }

    @Override
    public String toString() {
        return this.texteDocument;
    }
}
