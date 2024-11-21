import static org.junit.jupiter.api.Assertions.*;

import main.PRACTICAS_ARRAYS.Dni;
import org.junit.jupiter.api.Test;

class DniTest {

    @Test
    void letraDNI() {
        assertAll(
                () -> assertEquals('X', Dni.letraDNI(95129689)),
                () -> assertEquals('Y', Dni.letraDNI(12009801)),
                () -> assertEquals('K', Dni.letraDNI(87213399))
        );
    }
}
