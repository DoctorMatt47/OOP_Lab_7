package OOP_Lab_7.program.core.builder;

import OOP_Lab_7.program.domain.entity.apartment.Apartment;

/**
 * Represents creation of apartment.
 */
public interface IApartmentBuilder {
    /**
     * Builds apartment instance.
     * @return Apartment was built.
     */
    Apartment build();
}
