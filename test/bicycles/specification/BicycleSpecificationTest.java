package bicycles.specification;

import bicycles.BicycleType;
import bicycles.models.Bicycle;
import bicycles.rides.BikeRideOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BicycleSpecificationTest {

    @Test
    void getBicycleType() {
        BicycleSpecification bicycleSpecification =new BicycleSpecification(BicycleType.RoadBike);
        Bicycle bicycle = new BicycleFromSpec(bicycleSpecification);
        BikeRideOne bikeRideOne = new BikeRideOne(bicycle);
        assertEquals(BicycleType.RoadBike, bikeRideOne.getBicycleType());
    }

    @Test
    void getAccelerationSpeed() {
        BicycleSpecification bicycleSpecification = new BicycleSpecification(BicycleType.Tandem);
        BicycleFromSpec tandemBike = new BicycleFromSpec(bicycleSpecification);

        BicycleSpecification bicycleSpecification1 = new BicycleSpecification(BicycleType.RoadBike);
        BicycleFromSpec roadBike = new BicycleFromSpec(bicycleSpecification1);
        tandemBike.accelerate();
        roadBike.accelerate();

        assertEquals(tandemBike.currentSpeed(),12);
        assertEquals(roadBike.currentSpeed(),7);
    }

    @Test
    void getBrakeSpeed() {
        BicycleSpecification bicycleSpecification = new BicycleSpecification(BicycleType.MountainBike);
        BicycleFromSpec mountainBike = new BicycleFromSpec(bicycleSpecification);

        BicycleSpecification bicycleSpecification1 = new BicycleSpecification(BicycleType.RoadBike);
        BicycleFromSpec roadBike = new BicycleFromSpec(bicycleSpecification1);
        mountainBike.brake();
        roadBike.brake();

        assertEquals(mountainBike.currentSpeed(),0);
        assertEquals(roadBike.currentSpeed(),0);

    }
}