package manager;

import data.ParkingSpot;

import java.util.List;

public class TwoWheelerManager implements VehicleTypeManager {
    @Override
    public List<ParkingSpot> getParkingSpot() {
        return null;
    }

    @Override
    public double getParkingFees(double durationInHours) {
        return 0;
    }
}
