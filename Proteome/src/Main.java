import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choix;
        String chaine1;
        String chaine2;

        System.out.println("Bienvenue à protéome!");
        System.out.println("=============================================================");
        System.out.println("[E]ntrer des acides aminés");
        System.out.println("[R]echercher une protéine");
        System.out.println("[O]btenir la liste des acides aminés");
        System.out.println("[Q]uitter");
        choix = sc.next().toUpperCase().charAt(0);

        switch (choix){

            case 'E':
                System.out.println("Entrez une chaîne représentant une liste d’acides aminés");
                chaine1 = sc.next().toUpperCase();

                System.out.println(AcideAmines.lireAcidesAmines(chaine1));

                break;

            case 'R':
                System.out.println("Entrez une chaîne de charactère représentant une protéine");
                chaine2 = sc.nextLine();

                Proteome proteome = new Proteome();


                break;

            case 'O':


                break;

            case 'Q':

                break;

            default:
                System.out.println("Choix introuvable");
        }

        System.out.println("Merci d'Avoir utilisé Protéome");
        sc.close();
    }
}