package OOP_Lab_7.program.domain.entity.appliance;

import OOP_Lab_7.program.domain.entity.socket.ElectricOutlet;
import OOP_Lab_7.program.domain.entity.socket.IConnectable;
import OOP_Lab_7.program.domain.entity.socket.ISocket;
import OOP_Lab_7.program.domain.valueobject.Dimension;

public abstract class Appliance implements IConnectable {
    private final int id;
    private final Dimension dimension;
    private final int powerConsumption;
    private boolean isConnected = false;

    protected ElectricOutlet socket;

    protected Appliance(int id, Dimension dimension, int powerConsumption) {
        this.dimension = dimension;
        this.powerConsumption = powerConsumption;
        this.id = id;
    }

    @Override
    public void connect(ISocket socket) {
        if (!(socket instanceof ElectricOutlet)) {
            throw new IllegalArgumentException("Incorrect socket");
        }
        socket.plug(this);
        isConnected = true;
        this.socket = (ElectricOutlet) socket;
    }

    @Override
    public void disconnect() {
        if (socket != null) {
            isConnected = false;
            socket.pull();
        }
    }

    public int getId() {
        return id;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    @Override
    public String toString() {
        return "Appliance{" +
                "id=" + id +
                ", dimension=" + dimension +
                ", powerConsumption=" + powerConsumption +
                ", isConnected=" + isConnected +
                ", socket=" + socket +
                '}';
    }
}
