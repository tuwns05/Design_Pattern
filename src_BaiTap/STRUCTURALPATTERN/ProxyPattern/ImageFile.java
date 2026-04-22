package STRUCTURALPATTERN.ProxyPattern;

public class ImageFile implements DisplayObject{
    private String imagePath;


    public ImageFile(String imagePath) {
        this.imagePath = imagePath;
    }

    private void load() {
        System.out.println("Loading image from disk: " + imagePath);

    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + imagePath);
    }
}
