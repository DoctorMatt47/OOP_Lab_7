package OOP_Lab_7.program.domain.entity.socket;

/**
 * Represents socket interface.
 * It contains plug and pull methods,
 * and is plugged getter.
 */
public interface ISocket {
    /**
     * Connect connectable to the socket.
     * @param connectable Connectable to be connected.
     */
    void plug(IConnectable connectable);

    /**
     * Disconnect connected instance.
     */
    void pull();

    /**
     * Returns true if socket is connected; otherwise false.
     * @return true if socket is connected; otherwise false.
     */
    boolean isPlugged();
}
