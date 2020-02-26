package bicycles.rides;

import bicycles.BicycleType;
import bicycles.models.Bicycle;
import bicycles.models.Tandem;
import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunRideTest {
    @Test
    void accept() {
        BicycleSpecification bicycleSpecification = new BicycleSpecification( BicycleType.MountainBike);
        BicycleFromSpec bike = new BicycleFromSpec(bicycleSpecification);
        FunRide funRide = new FunRide(2);
        // add 2 same Bikes
        funRide.accept(bike);
        funRide.accept(bike);
        assertEquals(1, funRide.getCountForType(BicycleType.MountainBike));
    }

    @Test
    void getEnteredCount1() {
        BicycleSpecification bicycleSpecification = new BicycleSpecification(BicycleType.MountainBike);
        BicycleSpecification bicycleSpecification2 = new BicycleSpecification(BicycleType.RoadBike);
        BicycleSpecification bicycleSpecification3 = new BicycleSpecification(BicycleType.Tandem);

        BicycleFromSpec bike = new BicycleFromSpec(bicycleSpecification);
        BicycleFromSpec bike1 = new BicycleFromSpec(bicycleSpecification);
        BicycleFromSpec bike2 = new BicycleFromSpec(bicycleSpecification2);
        BicycleFromSpec bike3 = new BicycleFromSpec(bicycleSpecification3);

        FunRide funRide = new FunRide(5);
        funRide.accept(bike);
        funRide.accept(bike1);
        funRide.accept(bike2);
        funRide.accept(bike3);
        funRide.accept(bike3);
        funRide.accept(bike3);

        funRide.getEnteredCount();
        assertEquals(2, funRide.getCountForType(BicycleType.MountainBike));
        assertEquals(1, funRide.getCountForType(BicycleType.RoadBike));
        assertEquals(1, funRide.getCountForType(BicycleType.Tandem));

        assertEquals(4,funRide.getEnteredCount());
    }

    @Test
    void getCountForType() {
        BicycleSpecification bicycleSpecification1 = new BicycleSpecification(BicycleType.MountainBike);
        BicycleFromSpec bike = new BicycleFromSpec(bicycleSpecification1);

        BicycleSpecification bicycleSpecification2 = new BicycleSpecification(BicycleType.MountainBike);
        BicycleFromSpec bike1 = new BicycleFromSpec(bicycleSpecification2);


        BicycleSpecification bicycleSpecification3 = new BicycleSpecification(BicycleType.RoadBike);
        BicycleFromSpec bike2 = new BicycleFromSpec(bicycleSpecification3);

        BicycleSpecification bicycleSpecification4 = new BicycleSpecification(BicycleType.Tandem);
        BicycleFromSpec bike3 = new BicycleFromSpec(bicycleSpecification4);

        FunRide funRide = new FunRide(5);
        // add 3 different Bikes
        funRide.accept(bike);
        funRide.accept(bike1);
        funRide.accept(bike2);
        funRide.accept(bike3);
        assertEquals(2, funRide.getCountForType(BicycleType.MountainBike));
        assertEquals(1, funRide.getCountForType(BicycleType.RoadBike));
        assertEquals(1, funRide.getCountForType(BicycleType.Tandem));
    }
}