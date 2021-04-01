import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestProteine {

    @Test
    void testProteine(){
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

        assertEquals(cochon, proteome.rechercherNomCourtExact("cochon"));
        assertEquals(null, proteome.rechercherNomCourtExact("patate"));
        assertEquals(vache, proteome.rechercherNomCourtExact("vache"));
        assertEquals(tulipe,proteome.rechercherNomCourtExact("tulipe"));
        assertEquals(pomme,proteome.rechercherNomCourtExact("pomme"));
        assertEquals(null, proteome.rechercherNomCourtExact("ecureuil"));
        assertEquals(humain,proteome.rechercherNomCourtExact("humain"));

    }
}
