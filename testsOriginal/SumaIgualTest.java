import main.PRACTICAS_ARRAYS.Dni;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumaIgualTest {

//    @Test
//    void sumaIgual() {
//        assertEquals("[2 + 4] [3 + 3] [5 + 1]",
//                SumaIgual.sumaIgual(new int[]{2, 3, 3, 5, 4, 1}, 6).trim());
//    }

    public static class TestDni {

        @Test
        public void letraDNI() {
            assertAll(
                    () -> Assert.assertEquals('X', Dni.letraDNI(95129689)),
                    () -> Assert.assertEquals('Y', Dni.letraDNI(12009801)),
                    () -> Assert.assertEquals('K', Dni.letraDNI(87213399))
            );
        }
    }
}
