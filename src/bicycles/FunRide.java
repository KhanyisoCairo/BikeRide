package bicycles;

import java.util.ArrayList;
import java.util.List;

public class FunRide {
    List<BicycleFromSpec> list = new ArrayList<>();

    public void accept(BicycleFromSpec bicycleSpecification) {
        if (!list.contains(bicycleSpecification)) list.add(bicycleSpecification);
    }

    public int getCountForType(BicycleType bicycleType) {
        return list.size();
    }

}
