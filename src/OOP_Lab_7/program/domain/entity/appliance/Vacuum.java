package OOP_Lab_7.program.domain.entity.appliance;

import OOP_Lab_7.program.domain.valueobject.Dimension;

public class Vacuum extends Appliance {
    private final int bagCapacity;

    public Vacuum(int id, Dimension dimension, int powerConsumption, int bagCapacity) {
        super(id, dimension, powerConsumption);
        this.bagCapacity = bagCapacity;
    }

    public int getBagCapacity() {
        return bagCapacity;
    }

    @Override
    public String toString() {
        return "Vacuum{" +
                super.toString() +
                " bagCapacity=" + bagCapacity +
                '}';
    }
}
