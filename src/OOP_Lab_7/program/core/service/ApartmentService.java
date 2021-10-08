package OOP_Lab_7.program.core.service;

import OOP_Lab_7.program.domain.entity.apartment.Apartment;
import OOP_Lab_7.program.domain.entity.appliance.*;
import OOP_Lab_7.program.domain.valueobject.Dimension;
import org.w3c.dom.ranges.Range;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ApartmentService implements IApartmentService {
    private final Apartment apartment;

    public ApartmentService(Apartment apartment) {
        this.apartment = apartment;
    }

    @Override
    public ArrayList<Appliance> getAppliances() {
        return apartment.getAppliances();
    }

    @Override
    public ArrayList<Appliance> getSortedAppliances() {
        return apartment.getAppliances().stream()
                .sorted(Comparator.comparing(Appliance::getPowerConsumption))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public Appliance getAppliance(int id) {
        return apartment.getAppliances().stream()
                .filter(a -> a.getId() == id)
                .findFirst().orElse(null);
    }

    @Override
    public boolean switchConnection(Appliance appliance) {
        if (appliance.isConnected()) {
            appliance.disconnect();
            return true;
        }
        var unpluggedOutlet = apartment.getOutlets().stream()
                .filter(o -> !o.isPlugged())
                .findFirst().orElse(null);
        if (unpluggedOutlet == null) {
            return false;
        }
        appliance.connect(unpluggedOutlet);
        return true;
    }

    @Override
    public int getConsumptionPower() {
        var appliances = getAppliances();
        return IntStream.range(0, appliances.size())
                .reduce(0, (acc, appIndex) -> acc + appliances.get(appIndex)
                .getPowerConsumption());
    }
}
