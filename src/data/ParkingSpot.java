package data;

public class ParkingSpot {

    private final String floorNm;
    private final VehicleType vehicleType;
    private final String name;
    private final boolean isFree;

    public ParkingSpot(String floorNm, VehicleType vehicleType, String name, boolean isFree) {
        this.floorNm = floorNm;
        this.vehicleType = vehicleType;
        this.name = name;
        this.isFree = isFree;
    }

    public String getFloorNm() {
        return floorNm;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public String getName() {
        return name;
    }

    public boolean isFree() {
        return isFree;
    }
}
