package bicycles.rides;

import bicycles.BicycleBase;
import bicycles.BicycleFromSpec;
import bicycles.BicycleSpecification;
import bicycles.BikeRide;
import bicycles.models.Bicycle;
import org.junit.jupiter.api.Test;

import static bicycles.BicycleType.*;

public class BicycleSpecificationTest {
    @Test
    public void MountainBike(){
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3, MountainBike);
        BicycleBase mountainBike = new BicycleFromSpec(mountainBikeSpec);
        BikeRideOne mBikeRide = new BikeRideOne(mountainBike);
        mBikeRide.ride();
    }
    @Test
    public void RoadBike(){
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4, RoadBike);
        BicycleBase bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRideOne bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride();
    }
    @Test
    public void Tandem(){
        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12, 7, Tandem);
        BicycleBase bicycle = new BicycleFromSpec(tandemBikeSpec);
        BikeRideOne bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride();
    }
}
