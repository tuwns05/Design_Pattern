package BEHAVIOURALPATTERN.TemplateMethodPattern;

public class Client {
     public static void main(String[] args) {

         System.out.println("=== Công thức Margherita ===");
        PizzaRecipe margherita = new MargheritaPizza();
        margherita.makePizza();
        System.out.println("=== Công thức Pepperoni ===");
        PizzaRecipe pepperoni = new PepperoniPizza();
        pepperoni.makePizza();
}
}
