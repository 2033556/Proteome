import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestAcide {

    @Test
    void testAcide() {
        HashMap<AcideAmines, Integer> acideAminesIntegerHashMap = new HashMap<>();
        acideAminesIntegerHashMap.put(AcideAmines.A, 3);
        acideAminesIntegerHashMap.put(AcideAmines.R, 2);
        acideAminesIntegerHashMap.put(AcideAmines.D, 1);

        try {
            assertEquals(acideAminesIntegerHashMap, AcideAmines.lireAcidesAmines("AARRDA"));
        } catch (IllegalArgumentException illegalArgumentException) {
            illegalArgumentException.printStackTrace();
        }
    }
}
