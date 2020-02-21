package bicycles.models;

import bicycles.BicycleBase;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TandemTest {
  @Test
    public  void ShouldAccelerate(){
      Tandem tdm = new Tandem();
      tdm.accelerate();
      tdm.accelerate();
      assertEquals(tdm.currentSpeed(),24);
  }
  @Test
    public void braking(){
      Tandem brake = new Tandem();
      brake.accelerate();
      brake.brake();
      assertEquals(brake.currentSpeed(),5);
  }
  @Test
    public void stopping(){
      Tandem stop = new Tandem();
      stop.accelerate();
      stop.accelerate();
      stop.brake();
      stop.stop();
      assertEquals(stop.currentSpeed(),0);

  }




}
