package OOP_Lab_7.program.domain.entity.appliance;

import OOP_Lab_7.program.domain.valueobject.Dimension;

public class Fridge extends Appliance {
    private final int capacity;

    public Fridge(int id, Dimension dimension, int powerConsumption, int capacity) {
        super(id, dimension, powerConsumption);
        this.capacity = capacity;
    }


    public int getCapacity() {
        return capacity;
    }

}
