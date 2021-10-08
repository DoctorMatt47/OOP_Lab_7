package OOP_Lab_7.program.domain.entity.appliance;

import OOP_Lab_7.program.domain.valueobject.Dimension;

/**
 * Represents fridge appliance. Extends appliance class.
 */
public class Fridge extends Appliance {
    private final int capacity;

    /**
     * Fridge constructor.
     *
     * @param id               Unique identifier.
     * @param dimension        Size.
     * @param powerConsumption Consumed power.
     * @param capacity         Volume of fridge storage.
     */
    public Fridge(int id, Dimension dimension, int powerConsumption, int capacity) {
        super(id, dimension, powerConsumption);
        this.capacity = capacity;
    }

    /**
     * Returns volume of fridge storage.
     *
     * @return Volume of fridge storage.
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Constructs string which represents fridge.
     *
     * @return String which represents fridge.
     */
    @Override
    public String toString() {
        return "Fridge{" +
                super.toString() +
                " capacity=" + capacity +
                '}';
    }
}
