package OOP_Lab_7.program.domain.entity.appliance;

import OOP_Lab_7.program.domain.entity.socket.ElectricOutlet;
import OOP_Lab_7.program.domain.entity.socket.IConnectable;
import OOP_Lab_7.program.domain.entity.socket.ISocket;
import OOP_Lab_7.program.domain.valueobject.Dimension;
import org.jetbrains.annotations.Contract;

/**
 * Represents base appliance class. Implements IConnectable interface.
 */
public abstract class Appliance implements IConnectable {

    private final int id;

    private final Dimension dimension;

    private final int powerConsumption;

    private boolean isConnected = false;

    /**
     * The socket to which the appliance is connected.
     */
    protected ElectricOutlet socket;

    /**
     * Appliance constructor.
     *
     * @param id               Unique identifier.
     * @param dimension        Size.
     * @param powerConsumption Consumed power.
     */
    @Contract(pure = true)
    protected Appliance(int id, Dimension dimension, int powerConsumption) {
        this.dimension = dimension;
        this.powerConsumption = powerConsumption;
        this.id = id;
    }

    /**
     * Connects to the passed socket.
     *
     * @param socket Socket to which appliance will be connected.
     */
    @Override
    public void connect(ISocket socket) {
        if (!(socket instanceof ElectricOutlet)) {
            throw new IllegalArgumentException("Incorrect socket");
        }
        socket.plug(this);
        isConnected = true;
        this.socket = (ElectricOutlet) socket;
    }

    /**
     * Disconnects from socket.
     */
    @Override
    public void disconnect() {
        if (socket != null) {
            isConnected = false;
            socket.pull();
        }
    }

    /**
     * Unique identifier for appliance.
     *
     * @return Identifier.
     */
    public int getId() {
        return id;
    }

    /**
     * Returns size of appliance.
     *
     * @return Size.
     */
    public Dimension getDimension() {
        return dimension;
    }

    /**
     * Power consumed by appliance.
     *
     * @return Consumed power.
     */
    public int getPowerConsumption() {
        return powerConsumption;
    }

    /**
     * Returns true if appliance connected to the socket; otherwise false.
     *
     * @return Is appliance connected to socket.
     */
    public boolean isConnected() {
        return isConnected;
    }

    /**
     * Constructs string which represents appliance.
     *
     * @return String which represents appliance.
     */
    @Override
    public String toString() {
        return "Appliance{" +
                "id=" + id +
                ", dimension=" + dimension +
                ", powerConsumption=" + powerConsumption +
                ", isConnected=" + isConnected +
                '}';
    }
}
