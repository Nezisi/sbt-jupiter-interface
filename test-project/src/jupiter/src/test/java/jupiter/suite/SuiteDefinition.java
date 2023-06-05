package jupiter.suite;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Suite
@SelectPackages("jupiter.suite")
@IncludeClassNamePatterns({".*SuiteClass"})
public class SuiteDefinition {
    @Nested
    @DisplayName("Nested test inside suite definition")
    class SuiteDefinitionTestNested {

        @Test
        @DisplayName("Test inside nested class in suite definition")
        void sampleTestForMethodA() {
            assertTrue(true);
        }
    }
}
