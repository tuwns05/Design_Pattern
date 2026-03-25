package STRUCTURALPATTERN.BridgePattern.DrawShapeColor;

import STRUCTURALPATTERN.BridgePattern.DrawShapeColor.Color.Blue;
import STRUCTURALPATTERN.BridgePattern.DrawShapeColor.Color.Red;
import STRUCTURALPATTERN.BridgePattern.DrawShapeColor.Shape.Circle;
import STRUCTURALPATTERN.BridgePattern.DrawShapeColor.Shape.Shape;
import STRUCTURALPATTERN.BridgePattern.DrawShapeColor.Shape.Triangle;

public class Client {
    public static void main(String[] args) {
        Shape shape1 = new Circle(new Red());
        Shape shape2 = new Triangle(new Blue());

        shape1.Draw();
        shape2.Draw();
    }
}
