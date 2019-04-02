package bicycles.rides;

import bicycles.Bicycle;
import bicycles.BicycleType;


import java.util.*;

public class FunRide {
    private int bikeCount;
    private int numberOfBikes;
    private List<Bicycle> bicycles = new ArrayList<>();
    public FunRide(int maxNumOfBikes) {
        this.numberOfBikes = maxNumOfBikes;
    }

    public void accept(Bicycle bicycle) {
        if (!bicycles.contains(bicycle)&& numberOfBikes> bicycles.size()) {

            bicycles.add(bicycle);
             System.out.println("accepted");
        }

        else System.out.println("rejected");

    };

    public int getCountForType(BicycleType bicycleType) {
        for (Bicycle i : bicycles) {
            if (i.getBicycleType() == bicycleType) {
                bikeCount++;
            }
        }
        return bikeCount;
    }

    public int getEnteredCount() {

        return bicycles.size();
    }
}
