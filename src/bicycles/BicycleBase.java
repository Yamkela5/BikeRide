package bicycles;

public abstract class BicycleBase implements Bicycle {

    private int speed;

    protected void changeSpeed(int speedChange) {
        if (speed >= 0){
            this.speed += speedChange;
        } else {
            speed = 0;
        }

    }

    @Override
    public void stop() {
        this.speed = 0;
    }

    @Override
    public int currentSpeed() {
        return this.speed;
    }
}
