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

        Assertions.assertEquals(cochon, proteome.rechercherNomCourtExact("cochon"));
        Assertions.assertEquals(null, proteome.rechercherNomCourtExact("patate"));
        Assertions.assertEquals(vache, proteome.rechercherNomCourtExact("vache"));
        Assertions.assertEquals(tulipe, proteome.rechercherNomCourtExact("tulipe"));
        Assertions.assertEquals(pomme, proteome.rechercherNomCourtExact("pomme"));
        Assertions.assertEquals(null, proteome.rechercherNomCourtExact("ecureuil"));
        Assertions.assertEquals(humain, proteome.rechercherNomCourtExact("humain"));

    }
}
