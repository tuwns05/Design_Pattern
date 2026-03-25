package STRUCTURALPATTERN.AdapterPattern.CarPriceAdapter;

public class CarPriceCalculator implements PriceCalculator{
    //giá chưa chuyển đổi
    private int price;

    public CarPriceCalculator(int price) {
        this.price = price;
    }

    @Override
    public double calculatePrice() {
        return price *1.2;
    }
}
