package STRUCTURALPATTERN.FaCadePattern;

public class Facade {
    private Carbooking carbooked = new Carbooking();
    private Hotelbooking hotel = new Hotelbooking();
    private Flightbooking flight = new Flightbooking();

    public void bookVacation() {
        carbooked.bookCar();
        hotel.bookHotel();
        flight.bookFlight();
        System.out.println("booked successfully!");
    }
}
