package bicycles.rides;

import bicycles.BicycleType;
import bicycles.models.Bicycle;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class FunRide {
    List<Bicycle> list = new ArrayList<>();
    int BikeMax;

     public  FunRide(int BikeMax){
         this.BikeMax = BikeMax;
     }
    public  int getEnteredCount() {
     return list.size();
    }

    public void accept(Bicycle bike) {
        if (!list.contains(bike) && list.size() < BikeMax ){
            list.add(bike);
        }
        else {
            System.out.println("rejected");
        }
    }
    public int getCountForType(BicycleType bicycleType) {
        int getCount =  0;
            for(Bicycle i : list){
                if (i.getBicycleType() == bicycleType){
                    getCount++;
                }
            }
            return  getCount;
    }
}
