package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeEffacer extends CommandeDocument{

    public CommandeEffacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : effacer;start;end");
            return;
        }
        int start= Integer.parseInt(parameters[1]);
        int end = Integer.parseInt(parameters[2]);
        this.document.effacer(start,end);
        super.executer();
    }

    @Override
    public String getDescriptionCommande() {
        return "Efface une partie du texte du document";
    }
}
