package OOP_Lab_7.program.domain.entity.appliance;

import OOP_Lab_7.program.domain.valueobject.Dimension;

public class Microwave extends Appliance {
    private final int maxPower;

    public Microwave(int id, Dimension dimension, int powerConsumption, int maxPower) {
        super(id, dimension, powerConsumption);
        this.maxPower = maxPower;
    }

    public int getMaxPower() {
        return maxPower;
    }

    @Override
    public String toString() {
        return "Microwave{" +
                super.toString() +
                " maxPower=" + maxPower +
                '}';
    }
}
