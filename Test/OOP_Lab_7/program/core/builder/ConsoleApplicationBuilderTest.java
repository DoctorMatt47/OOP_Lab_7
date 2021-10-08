package OOP_Lab_7.program.core.builder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsoleApplicationBuilderTest {
    @Test
    void build() {
        var consoleBuilder = new ConsoleApplicationBuilder();
        var console = consoleBuilder.build();
        assertNotNull(console);
    }
}