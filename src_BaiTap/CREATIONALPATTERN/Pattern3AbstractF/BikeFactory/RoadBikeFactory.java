package CREATIONALPATTERN.Pattern3AbstractF.BikeFactory;

import CREATIONALPATTERN.Pattern3AbstractF.Saddle.RoadBikeSaddle;
import CREATIONALPATTERN.Pattern3AbstractF.Wheel.RoadBikeWheel;
import CREATIONALPATTERN.Pattern3AbstractF.Saddle.Saddle;
import CREATIONALPATTERN.Pattern3AbstractF.Wheel.Wheel;

public class RoadBikeFactory implements BikeFactory {
    @Override
    public Wheel getWheel() {
        return new RoadBikeWheel();
    }

    @Override
    public Saddle getSaddle() {
        return new RoadBikeSaddle();
    }
}
