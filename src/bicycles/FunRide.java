package bicycles;

import bicycles.models.Bicycle;

import java.util.ArrayList;
import java.util.List;

public class FunRide {
    List<Bicycle> list = new ArrayList<>();
    int getCount;

    public  int getEnteredCount(Bicycle bike) {
     return list.size();
    }

    public void accept(Bicycle bike) {
        if (!list.contains(bike)){
            list.add(bike);
        };
    }

    public int getCountForType(BicycleType bicycleType) {
            for(Bicycle i : list){
                if (i.getBicycleType() == bicycleType){
                    getCount++;
                }

            }
            return  getCount;
    }

}
