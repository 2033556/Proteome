import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choix;
        String chaine1;
        Proteines chaine2;

        do {
            System.out.println("=============================================================");
            System.out.println("Bienvenue à Protéome!");
            System.out.println("=============================================================");
            System.out.println("[E]ntrer des acides aminés");
            System.out.println("[R]echercher une protéine");
            System.out.println("[O]btenir la liste des acides aminés");
            System.out.println("[Q]uitter");
            choix = sc.next().toUpperCase().charAt(0);


            switch (choix) {

                case 'E':
                    System.out.println("Entrez une chaîne représentant une liste d’acides aminés");
                    chaine1 = sc.next().toUpperCase();
                    System.out.println(AcideAmines.lireAcidesAmines(chaine1));

                    break;

                case 'R':
                    System.out.println("Entrez une chaîne de charactère représentant une protéine");

                    Proteome proteome = new Proteome();

                    break;

                case 'O':
                    System.out.println("Voici la liste des acides aminés");
                        for(AcideAmines acide : AcideAmines.values()){
                            System.out.print(acide.name()+ ",");
                        }
                    System.out.println("\n");

                    break;

                case 'Q':
                    break;

                default:
                    System.out.println("Choix introuvable");
            }
        }
        while (choix != 'Q');

        System.out.println("Merci d'Avoir utilisé Protéome");
        sc.close();
    }
}