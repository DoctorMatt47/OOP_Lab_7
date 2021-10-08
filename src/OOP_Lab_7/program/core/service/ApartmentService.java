package OOP_Lab_7.program.core.service;

import OOP_Lab_7.program.domain.entity.apartment.Apartment;
import OOP_Lab_7.program.domain.entity.appliance.Appliance;
import org.jetbrains.annotations.Contract;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Represents main functionality for the apartment instance.
 * Implements apartment service interface.
 */
@SuppressWarnings("ClassCanBeRecord")
public class ApartmentService implements IApartmentService {
    private final Apartment apartment;

    /**
     * Apartment service constructor.
     * @param apartment Apartment instance.
     */
    @Contract(pure = true)
    public ApartmentService(Apartment apartment) {
        this.apartment = apartment;
    }

    /**
     * Returns appliances stored in apartment.
     * @return Apartment appliances collection.
     */
    @Override
    public ArrayList<Appliance> getAppliances() {
        return apartment.getAppliances();
    }

    /**
     * Returns appliances sorted by the power consumption.
     * @return Sorted apartment appliances collection.
     */
    @Override
    public ArrayList<Appliance> getSortedAppliances() {
        return apartment.getAppliances().stream()
                .sorted(Comparator.comparing(Appliance::getPowerConsumption).reversed())
                .collect(Collectors.toCollection(ArrayList::new));
    }

    /**
     * Returns appliance from apartment with passed id.
     * @param id Identifier of appliance to be found.
     * @return Appliance with passed id if found; otherwise null.
     */
    @Override
    public Appliance getAppliance(int id) {
        return apartment.getAppliances().stream()
                .filter(a -> a.getId() == id)
                .findFirst().orElse(null);
    }

    /**
     * Switches connection of passed appliance.
     * Returns true if successfully; otherwise false.
     * @param appliance Appliance connection to be switched.
     * @return True if successfully; otherwise false.
     */
    @Override
    public boolean switchConnection(Appliance appliance) {
        if (appliance.isConnected()) {
            appliance.disconnect();
            return true;
        }
        var unpluggedOutlet = apartment.getOutlets().stream()
                .filter(o -> !o.isPlugged())
                .findFirst().orElse(null);
        try {
            appliance.connect(unpluggedOutlet);
        } catch (Exception ex) {
            return false;
        }
        return true;
    }

    /**
     * Returns total consumption power of connected appliances stored in apartment.
     * @return Total consumption power
     */
    @Override
    public int getConsumptionPower() {
        var connectedAppliances = getAppliances().stream()
                .filter(Appliance::isConnected)
                .collect(Collectors.toCollection(ArrayList::new));
        return IntStream.range(0, connectedAppliances.size())
                .reduce(0, (acc, appIndex) ->
                        acc + connectedAppliances.get(appIndex).getPowerConsumption());
    }
}
