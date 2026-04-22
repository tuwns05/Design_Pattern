package STRUCTURALPATTERN.ProxyPattern;

public class Client {
    public static void main(String[] args) {
        DisplayObject img1 = new ImageProxy("resources/pic1.jpg");
        DisplayObject img2 = new ImageProxy("resources/pic2.jpg");
        DisplayObject img3 = new ImageProxy("resources/pic3.jpg");

        System.out.println("Slideshow started...");

        img1.display();
        img2.display();
        img1.display();
        img3.display();
    }
}
