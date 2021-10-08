package OOP_Lab_7.program.core.builder;

import OOP_Lab_7.program.infrastructure.console.ConsoleApplication;

/**
 * Represents creation of console application.
 */
public interface IConsoleApplicationBuilder {
    /**
     * Builds console application instance.
     * @return Console application was built.
     */
    ConsoleApplication build();
}
