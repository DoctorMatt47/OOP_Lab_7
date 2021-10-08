package OOP_Lab_7.program.domain.entity.socket;

/**
 * Represents electric outlet.
 * Implements socket interface.
 * It contains connect and disconnect methods.
 */
public class ElectricOutlet implements ISocket{
    private IConnectable connectable;
    private boolean isPlugged = false;

    /**
     * Connect socket.
     * @param connectable Connectable to be connected.
     */
    @Override
    public void plug(IConnectable connectable) {
        this.connectable = connectable;
        isPlugged = true;
    }

    /**
     * Disconnect connected instance.
     */
    @Override
    public void pull() {
        this.connectable = null;
        isPlugged = false;
    }

    /**
     * Returns true if socket is connected; otherwise false.
     * @return true if socket is connected; otherwise false.
     */
    @Override
    public boolean isPlugged() {
        return isPlugged;
    }
}
