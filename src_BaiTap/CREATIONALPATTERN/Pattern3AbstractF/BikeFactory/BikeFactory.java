package CREATIONALPATTERN.Pattern3AbstractF.BikeFactory;

import CREATIONALPATTERN.Pattern3AbstractF.Saddle.Saddle;
import CREATIONALPATTERN.Pattern3AbstractF.Wheel.Wheel;

public interface BikeFactory {
    Wheel getWheel();
    Saddle getSaddle();
}
