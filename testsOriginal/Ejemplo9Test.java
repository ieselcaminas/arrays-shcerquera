import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import main.PRACTICAS_ARRAYS.Exe_9_MET;

class Ejemplo9Test {

    @Test
    void pares() {
        assertAll(
            () -> assertEquals(3, Exe_9_MET.pares(4, 1, 5, 2, 8, 1, 3)),
            () -> assertEquals(4, Exe_9_MET.pares(4, 1, 5, 2, 8, 1, 8)),
            () -> assertEquals(2, Exe_9_MET.pares(1, 1, 5, 2, 8, 1, 3))
        );
    }

    @Test
    void impares() {
        assertAll(

            () -> assertEquals(5, Exe_9_MET.impares(4, 1, 5, 2, 8, 1, 3, 22, 23, 24)),
            () -> assertEquals(4, Exe_9_MET.impares(4, 1, 5, 2, 8, 1, 8, 22, 23, 24)),
            () -> assertEquals(6, Exe_9_MET.impares(1, 1, 5, 2, 8, 1, 3, 22, 23, 24))
        );
    }
}
