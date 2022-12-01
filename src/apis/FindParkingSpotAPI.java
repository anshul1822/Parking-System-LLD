package apis;

import data.EntryPoint;
import data.ParkingSpot;
import data.SpotSelection;
import data.VehicleType;
import finder.ParkingSpotFinder;
import manager.VehicleTypeManager;
import manager.VehicleTypeManagerFactory;
import selector.ParkingSpotSelector;
import selector.SpotSelectionFactory;

import java.time.temporal.ValueRange;

public class FindParkingSpotAPI {

    public ParkingSpot findParkingSpot(EntryPoint entryPoint, VehicleType vehicleType, SpotSelection spotSelection){

        VehicleTypeManager vehicleTypeManager = VehicleTypeManagerFactory.getVehicleTypeManager(vehicleType);

        ParkingSpotSelector parkingSpotSelector;
        if(spotSelection.equals(SpotSelection.RANDOM)){
            parkingSpotSelector = SpotSelectionFactory.getRandomSelector();
        }
        else if(spotSelection.equals(SpotSelection.NEAREST)){
            parkingSpotSelector = SpotSelectionFactory.getNearestSelector(entryPoint);
        }
        else throw new IllegalArgumentException("");


        return new ParkingSpotFinder(vehicleTypeManager, parkingSpotSelector).findParkingSpot();


    }
}
