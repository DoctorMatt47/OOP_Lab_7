package OOP_Lab_7.program.core.builder;

import OOP_Lab_7.program.domain.entity.apartment.Apartment;
import OOP_Lab_7.program.domain.entity.appliance.*;
import OOP_Lab_7.program.domain.entity.socket.ElectricOutlet;
import OOP_Lab_7.program.domain.valueobject.Dimension;

/**
 * Represents creation of apartment.
 * Implements apartment builder.
 */
public class ApartmentBuilder implements IApartmentBuilder {
    /**
     * Builds apartment instance.
     * @return Apartment was built.
     */
    @Override
    public Apartment build() {
        var apartment = new Apartment();
        buildAppliances(apartment);
        buildOutlets(apartment);
        return apartment;
    }

    /**
     * Constructs appliance collection. Adds it to the passed apartment.
     * @param apartment Apartment where to add appliances.
     */
    private void buildAppliances(Apartment apartment) {
        var appliances = apartment.getAppliances();
        appliances.add(new Fridge(11, new Dimension(80, 100, 193.5),
                1411, 360));
        appliances.add(new Fridge(12, new Dimension(80, 100, 193.5),
                1200 , 360));
        appliances.add(new AirConditioner(21, new Dimension(63.5, 45.8, 24),
                24000, 730));
        appliances.add(new AirConditioner(22, new Dimension(72, 49.5, 27),
                10000, 680));
        appliances.add(new Microwave(31, new Dimension(37.4, 48.9, 48.9),
                1000, 800));
        appliances.add(new Oven(41, new Dimension(56.6, 59.5, 45.5),
                1200, 1000));
        appliances.add(new Vacuum(51, new Dimension(35, 35, 81.5),
                1000, 1));
    }

    /**
     * Constructs outlet collection. Adds it to the passed apartment.
     * @param apartment Apartment where to add outlets.
     */
    private void buildOutlets(Apartment apartment) {
        var outlets = apartment.getOutlets();
        int COUNT_OF_OUTLET = 3;
        for (int i = 0; i < COUNT_OF_OUTLET; i++) {
            outlets.add(new ElectricOutlet());
        }
    }
}
