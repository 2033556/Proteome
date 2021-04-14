import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choix;

        System.out.println("[E]ntrer des acides aminés");
        System.out.println("[R]echercher une protéine");
        System.out.println("[O]btenir la liste des acides aminés");
        System.out.println("[Q]uitter");
        choix = sc.next().toUpperCase().charAt(0);

        switch (choix){

            case 'E':
                System.out.println("Entrez une chaîne représentant une liste d’acides aminés");

                break;

            case 'R':
                System.out.println("Entrez une chaîne de charactère représentant une protéine");


                break;

            case 'O':


                break;

            case 'Q':
                sc.close();

                break;

            default:
                System.out.println("Choix introuvable");
        }

        sc.close();
    }
}