package manager;

import data.ParkingSpot;

import java.util.List;

public interface VehicleTypeManager {

    List<ParkingSpot> getParkingSpot();

    double getParkingFees(double durationInHours);
}
