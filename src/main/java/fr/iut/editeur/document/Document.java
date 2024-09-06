package fr.iut.editeur.document;

public class Document {

    private String contentDocument;

    public Document() {
        this.contentDocument = "";
    }
	
    public String getContentDocument() {
        return contentDocument;
    }

    public void setContentDocument(String contentDocument) {
        this.contentDocument = contentDocument;
    }

    public void ajouter(String texte) {
        this.contentDocument += texte;
    }

    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = contentDocument.substring(0, debut);
        String partieDroite = contentDocument.substring(fin + 1);
        contentDocument = partieGauche + remplacement + partieDroite;
    }

    public void majuscules(int debut, int fin) {
        String partieGauche = contentDocument.substring(debut,fin + 1);
        remplacer(debut,fin,partieGauche.toUpperCase());
    }

    public void inserer(int position, String texte) {
        String partieGauche = this.contentDocument.substring(0, position);
        String partieDroite = this.contentDocument.substring(position);
        this.contentDocument = partieGauche + texte + partieDroite;
    }

    public void minuscules(int debut, int fin) {
        String partieGauche = contentDocument.substring(debut,fin + 1);
        remplacer(debut,fin,partieGauche.toLowerCase());
    }

    public void effacer(int start, int end) {
        remplacer(start,end,"");
    }

    public void clear() {
        contentDocument = "";
    }

    @Override
    public String toString() {
        return this.contentDocument;
    }
}
