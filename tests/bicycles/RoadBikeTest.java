package bicycles;

import bicycles.models.RoadBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoadBikeTest {
    @Test
    public void roadBikeSpeed() {
        RoadBike roadBike = new RoadBike();
        roadBike.accelerate();
        roadBike.brake();

        assertEquals(roadBike.currentSpeed(), 7);
    }
}