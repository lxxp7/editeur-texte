package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeMinuscule extends CommandeDocument{

    public CommandeMinuscule(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : minuscule;start;end");
            return;
        }
        int start = Integer.parseInt(parameters[1]);
        int end = Integer.parseInt(parameters[2]);
        this.document.minuscule(start,end);
        super.executer();
    }

    @Override
    public void getDescriptionCommande() {
        System.out.println("Sert à mettre un morceau de texte en minuscule -> Format attendu : minuscule;start;end");
    }

}

