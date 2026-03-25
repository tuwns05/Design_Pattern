package STRUCTURALPATTERN.AdapterPattern.CarPriceAdapter;

public class TruckPriceCalculator implements PriceCalculator{

    private int weight;

    public TruckPriceCalculator(int weight) {
        this.weight = weight;
    }

    @Override
    public double calculatePrice() {
        return weight * 200;
    }
}
