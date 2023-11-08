package fr.iut.editeur.document;

public class Document {

    private String contentDocument;

    public Document() {
        this.contentDocument = "";
    }
	
    public String getTexte() {
        return contentDocument;
    }

    public void setTexte(String texte) {
        this.contentDocument = texte;
    }

    @Override
    public String toString() {
        return this.contentDocument;
    }

    public void ajouter(String texte) {
        this.contentDocument += texte;
    }

    public void remplacer(int start, int end, String remplacement) {
        String leftPart = contentDocument.substring(0, start);
        String rightPart = contentDocument.substring(end);
        contentDocument = leftPart + remplacement + rightPart;
    }

    public void majuscules(int start, int end) {
        String changer=contentDocument.substring(start,end);
        String chanegement=changer.toUpperCase();
        remplacer(start,end,chanegement);
    }

    public void effacer(int start, int end) {
        remplacer(start,end,"");
    }

    public void clear(int start,int end){
        effacer(start,end);
    }
    public void inserer(int start,String ajout){
        remplacer(start,start,ajout);
    }
    public void minuscule(int start, int end) {
        String changer=contentDocument.substring(start,end);
        String chanegement=changer.toLowerCase();
        remplacer(start,end,chanegement);
    }

}
