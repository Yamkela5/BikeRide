package bicycles.models;

import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TandemBikeTest {
    @Test
    public void roadBikeSpeed() {
        Tandem roadBike = new Tandem();
        roadBike.accelerate();
        roadBike.brake();

        assertEquals(roadBike.currentSpeed(), 5);
    }
}