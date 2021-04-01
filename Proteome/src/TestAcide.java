import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestAcide {

    @Test
    void testAcide() {
        HashMap<AcideAmine.AcideAmines, Integer> acideAminesIntegerHashMap = new HashMap<>();
        AcideAmine acideAmine = new AcideAmine();
        acideAminesIntegerHashMap.put(AcideAmine.AcideAmines.A,3);
        acideAminesIntegerHashMap.put(AcideAmine.AcideAmines.R,2);
        acideAminesIntegerHashMap.put(AcideAmine.AcideAmines.D,1);

        assertEquals(acideAminesIntegerHashMap, acideAmine.lireAcidesAmines("AARRDA"));
    }
}
