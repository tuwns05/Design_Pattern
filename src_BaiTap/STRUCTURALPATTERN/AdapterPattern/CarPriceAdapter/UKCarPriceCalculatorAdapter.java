package STRUCTURALPATTERN.AdapterPattern.CarPriceAdapter;

import STRUCTURALPATTERN.AdapterPattern.UKCarPriceCalculator;

public class UKCarPriceCalculatorAdapter implements PriceCalculator {

    private UKCarPriceCalculator ukCalculator;


    public UKCarPriceCalculatorAdapter(UKCarPriceCalculator ukCalculator) {
        this.ukCalculator = ukCalculator;
    }

    @Override
    public double calculatePrice() {
        return ukCalculator.getPrice();
    }
}

