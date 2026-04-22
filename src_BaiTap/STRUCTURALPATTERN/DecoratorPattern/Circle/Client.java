package STRUCTURALPATTERN.DecoratorPattern.Circle;

public class Client {
    public static void main(String[] args) {
        Component c1= new Circle();
        Component c2 = new Circle();

        Component c3 = new RedBorderDicoractor(c2);

        System.out.println("Circle 1:");
        c1.draw();

        System.out.println("\nCircle 2 with Red Border:");
        c3.draw();
    }
}
