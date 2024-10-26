import static org.junit.jupiter.api.Assertions.*;

import main.PRACTICAS_ARRAYS.EXE_3_MET;

class Ejemplo3Test {

    @org.junit.jupiter.api.Test
    void letraDNI() {
        assertAll(
                () -> assertEquals('X', EXE_3_MET.letraDNI(95129689)),
                () -> assertEquals('Y', EXE_3_MET.letraDNI(12009801)),
                () -> assertEquals('K', EXE_3_MET.letraDNI(87213399))
        );
    }
}
