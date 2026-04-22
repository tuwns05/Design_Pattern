package STRUCTURALPATTERN.DecoratorPattern.Pizza;

public class ExtraCheeseDecorator implements PizzaWithExtraCheese{
    private Pizza pizza;

    public ExtraCheeseDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void addCheese() {
        System.out.println("add cheese");
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Extra Cheese";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 2.0;
    }
}
