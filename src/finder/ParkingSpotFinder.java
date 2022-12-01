package finder;

import data.ParkingSpot;
import manager.VehicleTypeManager;
import selector.ParkingSpotSelector;

import java.util.List;

public class ParkingSpotFinder {

    private final VehicleTypeManager vehicleTypeManager;
    private final ParkingSpotSelector parkingSpotSelector;


    public ParkingSpotFinder(VehicleTypeManager vehicleTypeManager, ParkingSpotSelector parkingSpotSelector) {
        this.vehicleTypeManager = vehicleTypeManager;
        this.parkingSpotSelector = parkingSpotSelector;
    }

    public ParkingSpot findParkingSpot(){
        List<ParkingSpot> parkingSpots = this.vehicleTypeManager.getParkingSpot();
        return this.parkingSpotSelector.selectSpot(parkingSpots);
    }
}
