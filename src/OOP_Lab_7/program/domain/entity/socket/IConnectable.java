package OOP_Lab_7.program.domain.entity.socket;

/**
 * Represents connectable interface.
 * It contains connect and disconnect methods.
 */
public interface IConnectable {

    /**
     * Connects to the socket.
     * @param socket Socket to which connectable will be connected.
     */
    void connect(ISocket socket);

    /**
     * Disconnects from socket.
     */
    void disconnect();

}
