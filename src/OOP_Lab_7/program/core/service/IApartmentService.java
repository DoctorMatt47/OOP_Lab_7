package OOP_Lab_7.program.core.service;

import OOP_Lab_7.program.domain.entity.appliance.Appliance;

import java.util.ArrayList;

public interface IApartmentService {
    ArrayList<Appliance> getAppliances();

    ArrayList<Appliance> getSortedAppliances();

    Appliance getAppliance(int id);

    boolean switchConnection(Appliance appliance);

    int getConsumptionPower();
}
