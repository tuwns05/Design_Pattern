package STRUCTURALPATTERN.BridgePattern.DrawShapeColor.Shape;

import STRUCTURALPATTERN.BridgePattern.DrawShapeColor.Color.Color;

public abstract class Shape {
    protected Color color;

        public Shape(Color color){
            this.color = color;
        }

        public abstract void Draw();
}
