package STRUCTURALPATTERN.DecoratorPattern.Pizza;

public class Client {
    public static void main(String[] args) {
        Pizza p1 = new BasicPizza();

        Pizza p2 = new ExtraCheeseDecorator(new BasicPizza());

        System.out.println("Pizza 1:");
        System.out.println(p1.getDescription() + " - $" + p1.getCost());

        System.out.println("\nPizza 2:");
        System.out.println(p2.getDescription() + " - $" + p2.getCost());
    }




}
