package selector;

import data.EntryPoint;

public class SpotSelectionFactory {

    private SpotSelectionFactory(){};

    public static ParkingSpotSelector getNearestSelector(EntryPoint entryPoint){
        return new NearestSelector(entryPoint);
    }

    public static ParkingSpotSelector getRandomSelector(){
        return new RandomSelector();
    }


}
