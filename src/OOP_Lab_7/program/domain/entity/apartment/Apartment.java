package OOP_Lab_7.program.domain.entity.apartment;

import OOP_Lab_7.program.domain.entity.appliance.*;
import OOP_Lab_7.program.domain.entity.socket.ElectricOutlet;
import OOP_Lab_7.program.domain.valueobject.Dimension;

import java.util.ArrayList;

public class Apartment {
    private final ArrayList<Appliance> appliances = new ArrayList<>();
    private final ArrayList<ElectricOutlet> outlets = new ArrayList<>();

    public ArrayList<Appliance> getAppliances() {
        return appliances;
    }

    public ArrayList<ElectricOutlet> getOutlets() {
        return outlets;
    }
}
