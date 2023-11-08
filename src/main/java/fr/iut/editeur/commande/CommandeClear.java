package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeClear extends CommandeDocument{

    public CommandeClear(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 1) {
            System.err.println("Format attendu : clear");
            return;
        }

        String texte = document.getTexte();
        int start = 0;
        int end = texte.length();
        this.document.clear(start,end);
        super.executer();
    }


    @Override
    public void getDescriptionCommande() {
        System.out.println("Sert à supprimer tout le texte -> Format attendu : clear;");
    }
}
