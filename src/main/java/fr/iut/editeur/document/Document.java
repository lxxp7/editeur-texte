package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin + 1);
        texte = partieGauche + remplacement + partieDroite;
    }

    public void majuscules(int debut, int fin) {
        String partieGauche = texte.substring(debut,fin + 1);
        remplacer(debut,fin,partieGauche.toUpperCase());
    }

    public void inserer(int position, String texte) {
        String partieGauche = this.texte.substring(0, position);
        String partieDroite = this.texte.substring(position);
        this.texte = partieGauche + texte + partieDroite;
    }

    public void effacer(int start, int end) {
        remplacer(start,end,"");
    }

    public void clear() {
        texte = "";
    }

    @Override
    public String toString() {
        return this.texte;
    }
}
