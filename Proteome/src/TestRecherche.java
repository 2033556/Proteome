import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRecherche {


    @Test
    void testRecherche() {
        Proteome proteome = new Proteome();

        Proteines proteines1 = new Proteines("NTAS1_HUMAN");
        Proteines proteines2 = new Proteines("Phospholipase A-2-activating protein");
        Proteines proteines3 = new Proteines("NACC1_HUMAN");
        Proteines proteines4 = new Proteines("Calcium-independent phospholipase A2-gamma");

        proteome.ajouterProteine(proteines1);
        proteome.ajouterProteine(proteines2);
        proteome.ajouterProteine(proteines3);
        proteome.ajouterProteine(proteines4);

        assertEquals(proteines1, proteome.rechercherNomCourtExact("NTAS1_HUMAN").get(0));
        assertEquals(proteines2, proteome.rechercherNomCourtExact("Phospholipase A-2-activating protein").get(0));
        assertEquals(proteines3, proteome.rechercherNomCourtExact("NACC1_HUMAN").get(0));
        assertEquals(proteines4, proteome.rechercherNomCourtExact("Calcium-independent phospholipase A2-gamma").get(0));
    }
}
