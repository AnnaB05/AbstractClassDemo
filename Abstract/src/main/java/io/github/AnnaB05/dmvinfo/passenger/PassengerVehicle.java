package io.github.AnnaB05.dmvinfo.passenger;

import io.github.AnnaB05.dmvinfo.Vehicle;
import io.github.AnnaB05.dmvinfo.VehicleTypes;

public abstract class PassengerVehicle extends Vehicle {
    private final Makes make;

    public PassengerVehicle (
            String vin,
            int manufactureYear,
            Makes make
    ) {
        super(
                vin,
                manufactureYear,
                VehicleTypes.PASSENGER
        );
        this.make = make;
    }

}
