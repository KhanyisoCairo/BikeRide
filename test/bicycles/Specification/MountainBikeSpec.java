package bicycles.Specification;

import bicycles.BicycleBase;
import bicycles.rides.BikeRideOne;
import org.junit.jupiter.api.Test;

import static bicycles.BicycleType.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MountainBikeSpec {
    @Test
    public void MountainBike(){
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3, MountainBike);
        BicycleBase mountainBike = new BicycleFromSpec(mountainBikeSpec);
        BikeRideOne mBikeRide = new BikeRideOne(mountainBike);
        mBikeRide.ride();
        assertEquals(MountainBike, mBikeRide.getBicycleType());
    }


}
