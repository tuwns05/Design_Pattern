package CREATIONALPATTERN.Pattern3AbstractF;

public class RoadBikeFactory implements BikeFactory{
    @Override
    public Wheel getWheel() {
        return new RoadBikeWheel();
    }

    @Override
    public Saddle getSaddle() {
        return new RoadBikeSaddle();
    }
}
