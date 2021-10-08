package OOP_Lab_7.program.core.service;

import OOP_Lab_7.program.domain.entity.appliance.Appliance;

import java.util.ArrayList;

/**
 * Represents main functionality for the apartment instance.
 */
public interface IApartmentService {
    /**
     * Returns appliances stored in apartment.
     * @return Apartment appliances collection.
     */
    ArrayList<Appliance> getAppliances();

    /**
     * Returns appliances sorted by the power consumption.
     * @return Sorted apartment appliances collection.
     */
    ArrayList<Appliance> getSortedAppliances();

    /**
     * Returns appliance from apartment with passed id.
     * @param id Identifier of appliance to be found.
     * @return Appliance with passed id if found; otherwise null.
     */
    Appliance getAppliance(int id);

    /**
     * Switches connection of passed appliance.
     * Returns true if successfully; otherwise false.
     * @param appliance Appliance connection to be switched.
     * @return True if successfully; otherwise false.
     */
    boolean switchConnection(Appliance appliance);

    /**
     * Returns total consumption power of connected appliances stored in apartment.
     * @return Total consumption power
     */
    int getConsumptionPower();
}
