package OOP_Lab_7.program.domain.entity.appliance;

import OOP_Lab_7.program.domain.entity.socket.ElectricOutlet;
import OOP_Lab_7.program.domain.entity.socket.IConnectable;
import OOP_Lab_7.program.domain.entity.socket.ISocket;
import OOP_Lab_7.program.domain.valueobject.Dimension;

public abstract class Appliance implements IConnectable {
    protected final Dimension dimension;
    protected final int powerConsumption;
    protected ElectricOutlet socket;

    protected Appliance(Dimension dimension, int powerConsumption) {
        this.dimension = dimension;
        this.powerConsumption = powerConsumption;
    }

    public Dimension getDimension() {
        return dimension;
    }

    @Override
    public void connect(ISocket socket) {
        if (!(socket instanceof ElectricOutlet)) {
            throw new IllegalArgumentException("Incorrect socket");
        }
        socket.plug(this);
        this.socket = (ElectricOutlet) socket;
    }

    @Override
    public void disconnect() {
        if (socket != null) socket.pull();
    }
}
