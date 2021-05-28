import Utilitaires.AcideAmines;
import Utilitaires.LecteurXml;
import Utilitaires.Proteines;
import Utilitaires.Proteome;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    //4G4T EI //test
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        char choix;
        String chaine1;
        String choixFichier;
        Proteome p = null;


        System.out.println("=============================================================");
        System.out.println("Bienvenue à Protéome!");
        System.out.println("Quel fichier voulez-vous lire aujourd'hui?|| chien.xml | chimpanze.xml | humain.xml | sarscov.xml | theier.xml | variole.xml |");
        choixFichier = sc2.next();
        Pattern nomDeFichier = Pattern.compile("chien.xml|humain.xml|sarscov.xml|theier.xml|variole.xml|chimpanze.xml");
        Matcher matcher = nomDeFichier.matcher(choixFichier);
        if (matcher.find()) {
            LecteurXml lecteurXml = new LecteurXml(choixFichier);
            p = lecteurXml.lireFichier(choixFichier);
        } else {
            throw new IllegalArgumentException("fichier invalide");
        }

        do {
            System.out.println("=============================================================");
            System.out.println("[E]ntrer des acides aminés");
            System.out.println("[R]echercher une protéine");
            System.out.println("[O]btenir la liste des acides aminés");
            System.out.println("[Q]uitter");
            choix = sc.nextLine().toUpperCase().charAt(0);


            switch (choix) {

                case 'E':
                    try {
                        System.out.println("Entrez une chaîne représentant une liste d’acides aminés");
                        chaine1 = sc.nextLine().toUpperCase();
                        System.out.println("Voici les protéines qui peuvent être synthétisées à partir de ces acides aminés");
                        System.out.println(p.rechercherSequence(chaine1));
                    } catch (IllegalArgumentException illegalArgumentException) {
                        illegalArgumentException.printStackTrace();
                    }

                    break;

                case 'R':
                    System.out.println("Entrez une chaîne de charactère représentant une protéine");
                    chaine1 = sc.nextLine();
                    List<Proteines> proteines = p.rechercherNomCourtExact(chaine1);
                    System.out.println(proteines);

                    break;

                case 'O':
                    for (AcideAmines acideAmines : AcideAmines.values()) {
                        System.out.println(acideAmines.rechercherUneProteine());
                    }
                    break;

                case 'Q':
                    break;

                default:
                    try {
                        throw new IllegalArgumentException("Séquence invalide");
                    } catch (IllegalArgumentException illegalArgumentException) {
                        illegalArgumentException.printStackTrace();
                    }

            }
        }
        while (choix != 'Q');

        System.out.println("Merci d'Avoir utilisé Protéome");
        sc.close();
    }
}