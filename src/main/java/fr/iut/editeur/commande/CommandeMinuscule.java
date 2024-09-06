package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeMinuscule extends CommandeDocument{

    public CommandeMinuscule(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : minuscules;start;end");
            return;
        }
        int start = Integer.parseInt(parameters[1]);
        int end = Integer.parseInt(parameters[2]);
        this.document.minuscules(start,end);
        super.executer();
    }

    @Override
    public String getDescriptionCommande() {
        return "Met en minuscule une partie du texte du document";
    }
}
