package OOP_Lab_7.program.domain.entity.appliance;

import OOP_Lab_7.program.domain.valueobject.Dimension;

public class AirConditioner extends Appliance {
    private final int airPower;

    public AirConditioner(int id, Dimension dimension, int powerConsumption, int airPower) {
        super(id, dimension, powerConsumption);
        this.airPower = airPower;
    }

    public int getAirPower() {
        return airPower;
    }
}
