package STRUCTURALPATTERN.BridgePattern.DrawShapeColor;

import STRUCTURALPATTERN.BridgePattern.DrawButton.Button.Button;
import STRUCTURALPATTERN.BridgePattern.DrawButton.Button.RadioButton;
import STRUCTURALPATTERN.BridgePattern.DrawButton.ButtonSize.Large;
import STRUCTURALPATTERN.BridgePattern.DrawButton.ButtonSize.Medium;
import STRUCTURALPATTERN.BridgePattern.DrawButton.ButtonSize.Small;
import STRUCTURALPATTERN.BridgePattern.DrawShapeColor.Color.Blue;
import STRUCTURALPATTERN.BridgePattern.DrawShapeColor.Color.Red;
import STRUCTURALPATTERN.BridgePattern.DrawShapeColor.Shape.Circle;
import STRUCTURALPATTERN.BridgePattern.DrawShapeColor.Shape.Shape;
import STRUCTURALPATTERN.BridgePattern.DrawShapeColor.Shape.Triangle;

public class Client {
    public static void main(String[] args) {
        //BUTTON
        Button b1 = new RadioButton(new Large());
        Button b2 = new RadioButton(new Medium());
        Button b3 = new RadioButton(new Small());
        //Shape
        Shape shape1 = new Circle(new Red());
        Shape shape2 = new Triangle(new Blue());

        b1.Draw();
        b2.Draw();
        b3.Draw();


        shape1.Draw();
        shape2.Draw();


    }
}
