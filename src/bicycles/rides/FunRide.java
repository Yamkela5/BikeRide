package bicycles.rides;

import bicycles.Bicycle;
import bicycles.BicycleType;

import java.util.*;
//
public class FunRide {
    private int bikeCount;
    private int numberOfBikes;
//    create a private list of bicycles
    private List<Bicycle> bicycles = new ArrayList<>();
    public FunRide(int maxNumOfBikes) {
        this.numberOfBikes = maxNumOfBikes;
    }

    public String accept(Bicycle bicycle) {
        if (numberOfBikes > bicycles.size()) {
            //  System.out.println(numberOfBikes);
            bicycles.add(bicycle);
            return "accept";
        }
        else return "reject";
    }

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
