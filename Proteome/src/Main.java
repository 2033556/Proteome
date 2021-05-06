import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choix;
        String chaine1;
        LecteurXml lecteurXml = new LecteurXml();
        Proteome p = lecteurXml.lireFichier();


        System.out.println("=============================================================");
        System.out.println("Bienvenue à Protéome!");
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
                    }catch (IllegalArgumentException illegalArgumentException){
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
                    for(AcideAmines acideAmines : AcideAmines.values()){
                        System.out.println(acideAmines.rechercherUneProteine());
                    }
                    break;

                case 'Q':
                    break;

                default:
                    try {
                        throw new IllegalArgumentException("Séquence invalide");
                    }catch (IllegalArgumentException illegalArgumentException){
                        illegalArgumentException.printStackTrace();
                    }

            }
        }
        while (choix != 'Q');

        System.out.println("Merci d'Avoir utilisé Protéome");
        sc.close();
    }
}