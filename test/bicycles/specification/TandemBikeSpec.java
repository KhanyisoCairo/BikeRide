package bicycles.specification;

import bicycles.BicycleBase;
import bicycles.rides.BikeRideOne;
import org.junit.jupiter.api.Test;

import static bicycles.BicycleType.Tandem;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TandemBikeSpec {
    @Test
    public void Tandem(){
        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12, 7, Tandem);
        BicycleBase bicycle = new BicycleFromSpec(tandemBikeSpec);
        BikeRideOne bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride();
        assertEquals(Tandem, bikeRide.getBicycleType());
    }
}
