package STRUCTURALPATTERN.AdapterPattern;

public class UKCarPriceCalculator {
    private int speed;
    private int weight;

    public UKCarPriceCalculator(int speed, int weight) {
        this.speed = speed;
        this.weight = weight;
    }

    public double getPrice() {
        return speed * 100 + weight * 50;
    }
}
