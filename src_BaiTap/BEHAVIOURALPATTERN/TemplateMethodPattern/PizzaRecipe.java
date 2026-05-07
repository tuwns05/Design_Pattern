package BEHAVIOURALPATTERN.TemplateMethodPattern;

public abstract class PizzaRecipe {
    // Template Method
    public final void makePizza() {
        prepareDough();
        addSauce();
        addToppings();
        bake();
    }

    // Các bước CHUNG
    private void prepareDough() {
        System.out.println("Nhào bột và cán mỏng...");
    }

    private void addSauce() {
        System.out.println("Phết sốt cà chua lên đế bánh...");
    }

    private void bake() {
        System.out.println("Nướng pizza ở 220°C trong 15 phút.");
        System.out.println("-----------------------------");
    }

    // Bước KHÁC NHAU
    protected abstract void addToppings();
}
