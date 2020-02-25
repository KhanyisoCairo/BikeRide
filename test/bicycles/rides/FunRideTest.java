package bicycles.rides;

import bicycles.Specification.BicycleFromSpec;
import bicycles.Specification.BicycleSpecification;
import bicycles.BicycleType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTest {
    @Test
    public  void  shouldAcceptBicyclesMountainBike(){
        BicycleSpecification bicycleSpecification = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        BicycleFromSpec bike = new BicycleFromSpec(bicycleSpecification);
        FunRide funRide = new FunRide(2);

        funRide.accept(bike);
        funRide.accept(bike);

        assertEquals(1, funRide.getCountForType(BicycleType.MountainBike));
    }
    @Test
    public  void  shouldAcceptBicyclesRoadBike(){
        BicycleSpecification bicycleSpecification = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        BicycleFromSpec bike = new BicycleFromSpec(bicycleSpecification);
        FunRide funRide = new FunRide(2);

        funRide.accept(bike);
        funRide.accept(bike);

        assertEquals(2, funRide.getCountForType(BicycleType.RoadBike));
    }
    @Test
    public  void  shouldAcceptBicyclesTandem(){
        BicycleSpecification bicycleSpecification = new BicycleSpecification(17, -7, BicycleType.Tandem);
        BicycleFromSpec bike = new BicycleFromSpec(bicycleSpecification);
        FunRide funRide = new FunRide(2);

        funRide.accept(bike);
        funRide.accept(bike);

        assertEquals(1, funRide.getCountForType(BicycleType.Tandem));
    }
    @Test
    public void shouldGetEnteredBicycles(){
        BicycleSpecification bicycleSpecification = new BicycleSpecification(5,-3,BicycleType.MountainBike);
        BicycleFromSpec bike = new BicycleFromSpec(bicycleSpecification);
        FunRide funRide = new FunRide(3);
        funRide.accept(bike);

        funRide.getEnteredCount(bike);
        assertEquals(1, funRide.getCountForType(BicycleType.MountainBike));
    }

}
