package OOP_Lab_7.program.domain.entity.socket;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElectricOutletTest {
    IConnectable connectable;

    @BeforeEach
    void setUp() {
        connectable = new IConnectable() {
            @Override
            public void connect(ISocket socket) {
            }

            @Override
            public void disconnect() {
            }
        };
    }

    @Test
    void plug() {
        var outlet = new ElectricOutlet();
        outlet.plug(connectable);
        assertTrue(outlet.isPlugged());
    }

    @Test
    void pull() {
        var outlet = new ElectricOutlet();
        outlet.plug(connectable);
        outlet.pull();
        assertFalse(outlet.isPlugged());
    }
}