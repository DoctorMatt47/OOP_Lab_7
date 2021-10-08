package OOP_Lab_7.program.domain.entity.appliance;

import OOP_Lab_7.program.domain.entity.socket.ElectricOutlet;
import OOP_Lab_7.program.domain.entity.socket.ISocket;
import OOP_Lab_7.program.domain.valueobject.Dimension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplianceTest {
    ISocket socket;

    @BeforeEach
    void setUp() {
        socket = new ElectricOutlet();
    }

    @Test
    void connect() {
        var applianceMock = new MockAppliance(1, new Dimension(1, 1, 1), 1);
        applianceMock.connect(socket);
        assertTrue(applianceMock.isConnected());
    }

    @Test
    void disconnect() {
        var applianceMock = new MockAppliance(1, new Dimension(1, 1, 1), 1);
        applianceMock.connect(socket);
        applianceMock.disconnect();
        assertFalse(applianceMock.isConnected());
    }
}

class MockAppliance extends Appliance {
    public MockAppliance(int id, Dimension dimension, int powerConsumption) {
        super(id, dimension, powerConsumption);
    }
}