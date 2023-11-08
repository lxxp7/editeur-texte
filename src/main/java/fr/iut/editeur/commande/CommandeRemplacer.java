package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument {

    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 4) {
            System.err.println("Format attendu : remplacer;start;end;texte");
            return;
        }

        String texte = parameters[3];
        int start = Integer.parseInt(parameters[1]);
        int end = Integer.parseInt(parameters[2]);
        this.document.remplacer(start,end,texte);
        super.executer();
    }


    @Override
    public void getDescriptionCommande() {
        System.out.println("Sert à remplacer un morceau de texte -> Format attendu : remplacer;start;end;texte");
    }

}
