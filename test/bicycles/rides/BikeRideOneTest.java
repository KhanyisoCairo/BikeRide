package bicycles.rides;

import bicycles.BicycleType;
import bicycles.models.Bicycle;
import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeRideOneTest {
    @Test
    void ride1() {
        BicycleSpecification bicycleSpecification = new BicycleSpecification(BicycleType.MountainBike);
        Bicycle bicycle = new BicycleFromSpec(bicycleSpecification);
        BikeRide bikeRideOne = new BikeRideOne(bicycle);

        bikeRideOne.ride();
        assertEquals(14, bikeRideOne.currentSpeed());
    }
    @Test
    void ride2() {
        BicycleSpecification bicycleSpecification =new BicycleSpecification(BicycleType.RoadBike);
        Bicycle bicycle = new BicycleFromSpec(bicycleSpecification);
        BikeRide bikeRideTwo = new BikeRideOne(bicycle);

        bikeRideTwo.ride();
        assertEquals(20, bikeRideTwo.currentSpeed());
    }
    @Test
    void ride3() {
        BicycleSpecification bicycleSpecification =new BicycleSpecification(BicycleType.Tandem);
        Bicycle bicycle = new BicycleFromSpec(bicycleSpecification);
        BikeRide bikeRideThree = new BikeRideOne(bicycle);

        bikeRideThree.ride();
        assertEquals(34, bikeRideThree.currentSpeed());
    }
    @Test
    void getBicycleType() {
        BicycleSpecification bicycleSpecification =new BicycleSpecification(BicycleType.Tandem);
        Bicycle bicycle = new BicycleFromSpec(bicycleSpecification);
        BikeRideOne bikeRideOne = new BikeRideOne(bicycle);
        assertEquals(BicycleType.Tandem, bikeRideOne.getBicycleType());    }
    }
