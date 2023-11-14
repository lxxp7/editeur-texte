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


    /**
     * sert à ajouter un texte à l'éditeur
     * @param texte : texte que vous voulez ajouter
     */
    public void ajouter(String texte) {
        this.texteDocument += texte;
    }


    /**
     * sert à remplacer les caractères de l'index start à l'index fin par remplacement
     * @param start indice de début
     * @param end indice de fin
     * @param remplacement string par lequel remplacer
     */
    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texteDocument.substring(0, start);
        String rightPart = texteDocument.substring(end);
        texteDocument = leftPart + remplacement + rightPart;
    }


    /**
     * sert à mettre un texte en majuscule
     * @param start index de début
     * @param end index de fin
     */
    public void majuscules(int start, int end) {
        String changer=texteDocument.substring(start,end);
        String chanegement=changer.toUpperCase();
        remplacer(start,end,chanegement);
    }


    /**
     * sert à effacer un texte
     * @param start
     * @param end
     */
    public void effacer(int start, int end) {
        remplacer(start,end,"");
    }

    /**
     * efface tout le texte
     * @param start
     * @param end
     */
    public void clear(int start,int end){
        effacer(start,end);
    }


    /**
     * insere du texte à partir de start
     * @param start
     * @param ajout
     */
    public void inserer(int start,String ajout){
        remplacer(start,start,ajout);
    }

    /**
     * mets le texte en minuscule
     * @param start
     * @param end
     */
    public void minuscule(int start, int end) {
        String changer=texteDocument.substring(start,end);
        String chanegement=changer.toLowerCase();
        remplacer(start,end,chanegement);
    }

}
