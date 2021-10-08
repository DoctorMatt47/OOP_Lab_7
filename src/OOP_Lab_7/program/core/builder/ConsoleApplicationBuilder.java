package OOP_Lab_7.program.core.builder;

import OOP_Lab_7.program.core.service.ApartmentService;
import OOP_Lab_7.program.infrastructure.console.ConsoleApplication;

/**
 * Represents creation of console application.
 * Implements console application builder.
 */
public class ConsoleApplicationBuilder implements IConsoleApplicationBuilder {
    /**
     * Builds console application instance.
     * @return Console application was built.
     */
    @Override
    public ConsoleApplication build() {
        var apartment = new ApartmentBuilder().build();
        var apartmentService = new ApartmentService(apartment);
        return new ConsoleApplication(apartmentService);
    }
}
