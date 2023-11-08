package fr.iut.editeur.document;

public class Document {

    private String texteDocument;

    public Document() {
        this.texteDocument = "";
    }

    public String getTexte() {
        return texteDocument;
    }

    public void setTexte(String texte) {
        this.texteDocument = texte;
    }

    @Override
    public String toString() {
        return this.texteDocument;
    }

    public void ajouter(String texte) {
        this.texteDocument += texte;
    }

    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texteDocument.substring(0, start);
        String rightPart = texteDocument.substring(end);
        texteDocument = leftPart + remplacement + rightPart;
    }

    public void majuscules(int start, int end) {
        String changer=texteDocument.substring(start,end);
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
        String changer=texteDocument.substring(start,end);
        String chanegement=changer.toLowerCase();
        remplacer(start,end,chanegement);
    }

}
