package Test;

import Utilitaires.Proteines;
import Utilitaires.Proteome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class TestProteine {

    @Test
    void testProteine() {
        Proteome proteome = new Proteome();

        Proteines cochon = new Proteines("cochon");
        Proteines vache = new Proteines("vache");
        Proteines tulipe = new Proteines("tulipe");
        Proteines pomme = new Proteines("pomme");
        Proteines humain = new Proteines("humain");

        proteome.ajouterProteine(cochon);
        proteome.ajouterProteine(vache);
        proteome.ajouterProteine(tulipe);
        proteome.ajouterProteine(pomme);
        proteome.ajouterProteine(humain);

        Assertions.assertEquals(cochon, proteome.rechercherNomCourtExact("cochon").get(0));
        Assertions.assertEquals(vache, proteome.rechercherNomCourtExact("vache").get(0));
        Assertions.assertEquals(tulipe, proteome.rechercherNomCourtExact("tulipe").get(0));
        Assertions.assertEquals(pomme, proteome.rechercherNomCourtExact("pomme").get(0));
        Assertions.assertEquals(humain, proteome.rechercherNomCourtExact("humain").get(0));

    }
}
