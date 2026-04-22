package STRUCTURALPATTERN.DecoratorPattern.Pizza;

public class BasicPizza implements Pizza{

    @Override
    public double getCost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "basic pizza";
    }
}
