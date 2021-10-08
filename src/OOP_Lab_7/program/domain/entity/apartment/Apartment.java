package OOP_Lab_7.program.domain.entity.apartment;

import OOP_Lab_7.program.domain.entity.appliance.Appliance;
import OOP_Lab_7.program.domain.entity.socket.ElectricOutlet;

import java.util.ArrayList;

/**
 * Represents apartment class.
 * It contains collection of appliances and outlets.
 */
public class Apartment {
    private final ArrayList<Appliance> appliances = new ArrayList<>();
    private final ArrayList<ElectricOutlet> outlets = new ArrayList<>();

    /**
     * Returns collection of appliances.
     * @return Appliances collection.
     */
    public ArrayList<Appliance> getAppliances() {
        return appliances;
    }

    /**
     * Returns collection of outlets.
     * @return Outlets collection.
     */
    public ArrayList<ElectricOutlet> getOutlets() {
        return outlets;
    }
}
