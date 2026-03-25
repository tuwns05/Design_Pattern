package STRUCTURALPATTERN.AdapterPattern;

import STRUCTURALPATTERN.AdapterPattern.CarPriceAdapter.CarPriceCalculator;
import STRUCTURALPATTERN.AdapterPattern.CarPriceAdapter.PriceCalculator;
import STRUCTURALPATTERN.AdapterPattern.CarPriceAdapter.TruckPriceCalculator;
import STRUCTURALPATTERN.AdapterPattern.CarPriceAdapter.UKCarPriceCalculatorAdapter;

public class Client {
    public static void main(String[] args) {
        // Xe thường
        PriceCalculator car = new CarPriceCalculator(20000);

        // Xe tải
        PriceCalculator truck = new TruckPriceCalculator(5000);

        // Xe UK (dùng Adapter)
        UKCarPriceCalculator ukCar = new UKCarPriceCalculator(120, 1500);
        PriceCalculator ukAdapter = new UKCarPriceCalculatorAdapter(ukCar);

        // In kết quả
        System.out.println("Car price: " + car.calculatePrice());
        System.out.println("Truck price: " + truck.calculatePrice());
        System.out.println("UK Car price: " + ukAdapter.calculatePrice());
    }
}
