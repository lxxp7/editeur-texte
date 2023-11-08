package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeMajuscule extends CommandeDocument{

        public CommandeMajuscule(Document document, String[] parameters) {
            super(document, parameters);
        }

        @Override
        public void executer() {
            if(parameters.length < 3) {
                System.err.println("Format attendu : majuscule;start;end");
                return;
            }
            int start = Integer.parseInt(parameters[1]);
            int end = Integer.parseInt(parameters[2]);
            this.document.majuscules(start,end);
            super.executer();
        }

    @Override
    public void getDescriptionCommande() {
        System.out.println("Sert à mettre un morceau de texte en majuscule -> Format attendu : majuscule;start;end");
    }
    }

