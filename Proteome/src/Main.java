import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Proteines viande = new Proteines("v");
        Proteines poisson = new Proteines("p");
        Proteines oeufs = new Proteines("o");
        Proteines lait = new Proteines("l");
        Proteines noix = new Proteines("n");

        Proteome proteome = new Proteome();

        proteome.ajouterProteine(viande);
        proteome.ajouterProteine(poisson);
        proteome.ajouterProteine(oeufs);
        proteome.ajouterProteine(lait);
        proteome.ajouterProteine(noix);

        System.out.println(proteome.rechercherNomCourtExact("v"));
        System.out.println(proteome.rechercherNomCourtExact("n"));
        System.out.println(proteome.rechercherNomCourtExact("k"));


    }
}