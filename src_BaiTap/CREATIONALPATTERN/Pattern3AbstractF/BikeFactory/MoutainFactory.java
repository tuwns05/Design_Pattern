package CREATIONALPATTERN.Pattern3AbstractF.BikeFactory;

import CREATIONALPATTERN.Pattern3AbstractF.Saddle.MountainBikeSaddle;
import CREATIONALPATTERN.Pattern3AbstractF.Wheel.MountainBikeWheel;
import CREATIONALPATTERN.Pattern3AbstractF.Saddle.Saddle;
import CREATIONALPATTERN.Pattern3AbstractF.Wheel.Wheel;

public class MoutainFactory implements BikeFactory {
    @Override
    public Wheel getWheel() {
        return new MountainBikeWheel();
    }

    @Override
    public Saddle getSaddle() {
        return new MountainBikeSaddle();
    }
}
