package bicycles.rides;

import bicycles.BikeRide;
import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideOneTest  {
    @Test
    public void mountainBike(){
        MountainBike mb = new MountainBike();
       BikeRideOne bike1 = new BikeRideOne(mb);
       bike1.ride();
       assertEquals(bike1.currentSpeed(),14);
    }
    @Test
    public void roadBike(){
        RoadBike rb = new RoadBike();
        BikeRideOne bike2 =new BikeRideOne(rb);
        bike2.ride();
        assertEquals(bike2.currentSpeed(),36);
    }
    @Test
    public void tandemBike(){
        Tandem tm = new Tandem();
        BikeRideOne bike3 = new BikeRideOne(tm);
        bike3.ride();
        assertEquals(bike3.currentSpeed(),34);
    }
}
