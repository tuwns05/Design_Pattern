package STRUCTURALPATTERN.DecoratorPattern.Circle;

public class RedBorderDicoractor implements ComponentsWithRedBorder {
    private Component component;

    public RedBorderDicoractor(Component component) {
        this.component = component;
    }

    @Override
    public void setRedBorder() {
        System.out.println("add red border");
    }

    @Override
    public void draw() {
        component.draw();
        setRedBorder();
    }
}
