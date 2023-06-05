package jupiter.suite;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class SuiteClass {
    @Test
    void testGet() {
        assertTrue(true);
    }

    @Nested
    @DisplayName("Nested test inside suite test")
    class SuiteDefinitionTestNested {

        @Test
        @DisplayName("Test inside nested class in suite test")
        void sampleTestForMethodA() {
            assertTrue(true);
        }
    }
}
