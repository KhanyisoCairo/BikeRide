package bicycles.rides;

import bicycles.BicycleSpecification;
import bicycles.BicycleType;
import bicycles.models.MountainBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnumBicycleTypeTest {
    @Test
    void MountainBikeTest(){
        BicycleSpecification bike = new BicycleSpecification(5, -3, BicycleType.MountainBike);

        assertEquals(BicycleType.MountainBike, bike.getBicycleType());
    }
    @Test
    void RoadBikeTest(){
        BicycleSpecification bike = new BicycleSpecification(11, -4, BicycleType.RoadBike);

        assertEquals(BicycleType.RoadBike, bike.getBicycleType());
    }
    @Test
    void TandemTest(){
        BicycleSpecification bike = new BicycleSpecification(12, -7, BicycleType.Tandem);

        assertEquals(BicycleType.Tandem, bike.getBicycleType());
    }
}