package Pattern3AbstractF;

public class Client {
    public static void main(String[] args){
        BikeFactory factory1 = new MoutainFactory();
        Wheel wheel1 = factory1.getWheel();
        Saddle saddle1 = factory1.getSaddle();
        wheel1.CreateWheel();
        saddle1.createSaddle();

        BikeFactory factory2 = new RoadBikeFactory();
        Wheel wheel2 = factory2.getWheel();
        Saddle saddle2 = factory2.getSaddle();
        wheel2.CreateWheel();
        saddle2.createSaddle();

    }
}
