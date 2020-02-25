package bicycles.Specification;

import bicycles.BicycleBase;
import bicycles.rides.BikeRideOne;
import org.junit.jupiter.api.Test;

import static bicycles.BicycleType.RoadBike;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoadBikeSpec {
    @Test
    public void RoadBike(){
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4, RoadBike);
        BicycleBase bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRideOne bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride();
        assertEquals(RoadBike, bikeRide.getBicycleType());
    }
}
