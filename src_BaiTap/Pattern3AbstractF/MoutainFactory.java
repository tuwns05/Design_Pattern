package Pattern3AbstractF;

public class MoutainFactory implements BikeFactory{
    @Override
    public Wheel getWheel() {
        return new MountainBikeWheel();
    }

    @Override
    public Saddle getSaddle() {
        return new MountainBikeSaddle();
    }
}
