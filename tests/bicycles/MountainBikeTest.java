package bicycles;

import bicycles.models.MountainBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MountainBikeTest {
    @Test
    public void roadBikeSpeed() {
        MountainBike roadBike = new MountainBike();
        roadBike.accelerate();
        roadBike.brake();

        assertEquals(roadBike.currentSpeed(), 2);
    }
}

