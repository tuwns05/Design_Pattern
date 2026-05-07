package BEHAVIOURALPATTERN.TemplateMethodPattern;

public class PepperoniPizza extends PizzaRecipe{

    @Override
    protected void addToppings() {
        System.out.println("Add topping: A B D");
    }
}
