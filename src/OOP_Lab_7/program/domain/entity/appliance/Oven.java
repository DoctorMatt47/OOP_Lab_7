package OOP_Lab_7.program.domain.entity.appliance;

import OOP_Lab_7.program.domain.valueobject.Dimension;

public class Oven extends Appliance {
    private final int maxHeatTemperature;

    public Oven(Dimension dimension, int powerConsumption, int maxHeatTemperature) {
        super(dimension, powerConsumption);
        this.maxHeatTemperature = maxHeatTemperature;
    }

    public int getMaxHeatTemperature() {
        return maxHeatTemperature;
    }
}
