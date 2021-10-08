package OOP_Lab_7.program.core.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ApartmentBuilderTest {
    @Test
    void build() {
        var apartmentBuilder = new ApartmentBuilder();
        var apartment = apartmentBuilder.build();
        assertEquals(7, apartment.getAppliances().size());
        assertEquals(3, apartment.getOutlets().size());
    }
}