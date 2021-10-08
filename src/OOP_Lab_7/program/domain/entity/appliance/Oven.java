package OOP_Lab_7.program.domain.entity.appliance;

import OOP_Lab_7.program.domain.valueobject.Dimension;

/**
 * Represents oven appliance. Extends appliance class.
 */
public class Oven extends Appliance {
    private final int maxHeatTemperature;

    /**
     * Oven constructor.
     *
     * @param id               Unique identifier.
     * @param dimension        Size.
     * @param powerConsumption Consumed power.
     * @param maxHeatTemperature Maximum heat temperature.
     */
    public Oven(int id, Dimension dimension, int powerConsumption, int maxHeatTemperature) {
        super(id, dimension, powerConsumption);
        this.maxHeatTemperature = maxHeatTemperature;
    }

    /**
     * Returns maximum heat temperature.
     * @return Maximum heat temperature.
     */
    public int getMaxHeatTemperature() {
        return maxHeatTemperature;
    }

    /**
     * Constructs string which represents microwave.
     *
     * @return String which represents microwave.
     */
    @Override
    public String toString() {
        return "Oven{" +
                super.toString() +
                " maxHeatTemperature=" + maxHeatTemperature +
                '}';
    }
}
