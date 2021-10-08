package OOP_Lab_7.program.core.builder;

import OOP_Lab_7.program.core.service.ApartmentService;
import OOP_Lab_7.program.infrastructure.console.ConsoleApplication;

public class ConsoleApplicationBuilder implements IConsoleApplicationBuilder {
    @Override
    public ConsoleApplication build() {
        var apartment = new ApartmentBuilder().build();
        var apartmentService = new ApartmentService(apartment);
        return new ConsoleApplication(apartmentService);
    }
}
