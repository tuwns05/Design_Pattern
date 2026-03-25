package STRUCTURALPATTERN.BridgePattern.DrawShapeColor.Shape;

import STRUCTURALPATTERN.BridgePattern.DrawShapeColor.Color.Color;

public class Triangle extends Circle{

    public Triangle (Color color){
        super(color);
    }
        @Override
    public void Draw() {
        System.out.println("Draw Triangle with:");
        color.applyColor();
    }
}
