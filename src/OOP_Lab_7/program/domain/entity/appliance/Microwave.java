package OOP_Lab_7.program.domain.entity.appliance;

import OOP_Lab_7.program.domain.valueobject.Dimension;

/**
 * Represents microwave appliance. Extends appliance class.
 */
public class Microwave extends Appliance {
    private final int maxPower;

    /**
     * Microwave constructor.
     *
     * @param id               Unique identifier.
     * @param dimension        Size.
     * @param powerConsumption Consumed power.
     * @param maxPower         Maximum heat power.
     */
    public Microwave(int id, Dimension dimension, int powerConsumption, int maxPower) {
        super(id, dimension, powerConsumption);
        this.maxPower = maxPower;
    }

    /**
     * Returns maximum heat power.
     *
     * @return Maximum heat power.
     */
    public int getMaxPower() {
        return maxPower;
    }

    /**
     * Constructs string which represents microwave.
     *
     * @return String which represents microwave.
     */
    @Override
    public String toString() {
        return "Microwave{" +
                super.toString() +
                " maxPower=" + maxPower +
                '}';
    }
}
