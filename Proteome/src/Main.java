import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Proteome proteome = new Proteome();
        Scanner sc = new Scanner(System.in);
        Proteines proteine;

        System.out.println("Bienvenue dans protéome");
        do {
            System.out.println("Veuillez entrer le nom de la protéine recherchée");
            System.out.println("Écrivez Q pour quitter");

            proteine = sc.nextLine();
            proteome.ajouterProteine(proteine);

        }
        while ()


        sc.close();
    }
}