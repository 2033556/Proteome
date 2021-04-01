import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestAcide {

    @Test//Ils arrivent à la même chose mais ça n'affiche pas que c'est bon..
    void testAcide() {
        AcideAmine acideAmine = new AcideAmine();
        assertEquals("{A=3}",acideAmine.lireAcidesAmines("AAA"));
        assertEquals("{A=2}", acideAmine.lireAcidesAmines("AA"));
        assertEquals("{A=1} {D=1}", acideAmine.lireAcidesAmines("AD"));
        assertEquals("{D=2}", acideAmine.lireAcidesAmines("DD"));
    }
}
