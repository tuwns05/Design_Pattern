package STRUCTURALPATTERN.BridgePattern.DrawShapeColor.Shape;

import STRUCTURALPATTERN.BridgePattern.DrawShapeColor.Color.Color;

public class Circle extends Shape{
        public Circle(Color color){
            super(color);
        }
    @Override
  public void Draw() {
        System.out.println("Draw circle with:");
        color.applyColor();
    }
}
