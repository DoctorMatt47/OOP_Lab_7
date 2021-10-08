package OOP_Lab_7.program.domain.entity.appliance;

import OOP_Lab_7.program.domain.valueobject.Dimension;

/**
 * Represents vacuum appliance. Extends appliance class.
 */
public class Vacuum extends Appliance {
    private final int bagCapacity;

    /**
     * Vacuum constructor.
     *
     * @param id               Unique identifier.
     * @param dimension        Size.
     * @param powerConsumption Consumed power.
     * @param bagCapacity      Volume of the garbage bag.
     */
    public Vacuum(int id, Dimension dimension, int powerConsumption, int bagCapacity) {
        super(id, dimension, powerConsumption);
        this.bagCapacity = bagCapacity;
    }

    /**
     * Returns volume of garbage bag.
     *
     * @return Volume of garbage bag.
     */
    public int getBagCapacity() {
        return bagCapacity;
    }

    /**
     * Constructs string which represents vacuum.
     *
     * @return String which represents vacuum.
     */
    @Override
    public String toString() {
        return "Vacuum{" +
                super.toString() +
                " bagCapacity=" + bagCapacity +
                '}';
    }
}
