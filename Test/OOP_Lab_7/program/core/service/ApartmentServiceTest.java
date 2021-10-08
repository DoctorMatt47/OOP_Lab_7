package OOP_Lab_7.program.core.service;

import OOP_Lab_7.program.core.builder.ApartmentBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApartmentServiceTest {
    ApartmentService apartmentService;

    @BeforeEach
    void setUp() {
        apartmentService = new ApartmentService(new ApartmentBuilder().build());
    }

    @Test
    void getAppliances() {
        var appliances = apartmentService.getAppliances();
        assertNotNull(appliances);
        assertEquals(appliances.size(), 7);
    }

    @Test
    void getSortedAppliances() {
        var sortedAppliances = apartmentService.getSortedAppliances();
        assertNotNull(sortedAppliances);
        assertEquals(sortedAppliances.size(), 7);
        var prevAppliance = sortedAppliances.get(0);
        for (var appliance : sortedAppliances) {
            assertTrue(appliance.getPowerConsumption() <= prevAppliance.getPowerConsumption());
        }
    }

    @Test
    void getAppliance() {
        var notNullAppliance = apartmentService.getAppliance(51);
        assertNotNull(notNullAppliance);
        var nullAppliance = apartmentService.getAppliance(101);
        assertNull(nullAppliance);
    }

    @Test
    void switchConnection() {
        var appliance = apartmentService.getAppliance(51);
        var trueResult = apartmentService.switchConnection(appliance);
        assertTrue(trueResult);
        assertTrue(appliance.isConnected());
        apartmentService.switchConnection(appliance);
        assertFalse(appliance.isConnected());

        apartmentService.switchConnection(apartmentService.getAppliance(11));
        apartmentService.switchConnection(apartmentService.getAppliance(21));
        apartmentService.switchConnection(apartmentService.getAppliance(31));

        var falseResult = apartmentService.switchConnection(appliance);
        assertFalse(falseResult);
        assertFalse(appliance.isConnected());
    }

    @Test
    void getConsumptionPower() {
        assertEquals(apartmentService.getConsumptionPower(), 0);

        apartmentService.switchConnection(apartmentService.getAppliance(11));
        apartmentService.switchConnection(apartmentService.getAppliance(21));
        apartmentService.switchConnection(apartmentService.getAppliance(31));

        assertEquals(apartmentService.getConsumptionPower(), 26411);
    }
}