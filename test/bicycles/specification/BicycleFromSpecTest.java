package bicycles.specification;

import bicycles.BicycleType;
import bicycles.models.Bicycle;
import bicycles.rides.BikeRideOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BicycleFromSpecTest {

    @Test
    void accelerate() {
    BicycleSpecification bicycleSpecification = new BicycleSpecification(BicycleType.MountainBike);
    BicycleFromSpec mountainBike = new BicycleFromSpec(bicycleSpecification);

        BicycleSpecification bicycleSpecification1 = new BicycleSpecification(BicycleType.RoadBike);
        BicycleFromSpec roadBike = new BicycleFromSpec(bicycleSpecification1);
        mountainBike.accelerate();
        roadBike.accelerate();

        assertEquals(mountainBike.currentSpeed(),5);
        assertEquals(roadBike.currentSpeed(),7);


    }

    @Test
    void brake() {
        BicycleSpecification bicycleSpecification = new BicycleSpecification(BicycleType.RoadBike);
        BicycleFromSpec roadBike = new BicycleFromSpec(bicycleSpecification);

        BicycleSpecification bicycleSpecification1 = new BicycleSpecification(BicycleType.Tandem);
        BicycleFromSpec TandemBike = new BicycleFromSpec(bicycleSpecification1);
        roadBike.brake();
        TandemBike.brake();

        assertEquals(roadBike.currentSpeed(),0);
        assertEquals(TandemBike.currentSpeed(),0);

    }

    @Test
    void getBicycleType() {
        BicycleSpecification bicycleSpecification =new BicycleSpecification(BicycleType.MountainBike);
        Bicycle bicycle = new BicycleFromSpec(bicycleSpecification);
        BikeRideOne bikeRideOne = new BikeRideOne(bicycle);
        assertEquals(BicycleType.MountainBike, bikeRideOne.getBicycleType());
    }
}