import java.util.Scanner;

public class Main {

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        String proteine;

        System.out.println("Bienvenue dans protéome");
        do {
            System.out.println("Veuillez entrer le nom de la protéine recherchée");
            System.out.println("Écrivez Q pour quitter");

            proteine = sc.nextLine();
        }
        while (proteine != "Q");

        sc.close();
    }
}