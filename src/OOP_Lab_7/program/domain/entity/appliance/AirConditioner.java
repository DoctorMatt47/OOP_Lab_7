package OOP_Lab_7.program.domain.entity.appliance;

import OOP_Lab_7.program.domain.valueobject.Dimension;

/**
 * Represents air conditioner appliance. Extends appliance class.
 */
public class AirConditioner extends Appliance {
    private final int airPower;

    /**
     * Air conditioner constructor.
     *
     * @param id               Unique identifier.
     * @param dimension        Size.
     * @param powerConsumption Consumed power.
     * @param airPower         Power of air.
     */
    public AirConditioner(int id, Dimension dimension, int powerConsumption, int airPower) {
        super(id, dimension, powerConsumption);
        this.airPower = airPower;
    }

    /**
     * Returns power of air.
     *
     * @return Power of air.
     */
    public int getAirPower() {
        return airPower;
    }

    /**
     * Constructs string which represents air conditioner.
     *
     * @return String which represents air conditioner.
     */
    @Override
    public String toString() {
        return "AirConditioner{" +
                super.toString() +
                " airPower=" + airPower +
                '}';
    }
}
