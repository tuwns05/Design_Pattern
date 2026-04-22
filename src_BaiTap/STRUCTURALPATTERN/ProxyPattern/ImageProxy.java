package STRUCTURALPATTERN.ProxyPattern;

public class ImageProxy implements DisplayObject {
    private String imagePath;
    private ImageFile realImageFile;

    public ImageProxy(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public void display() {
        if (realImageFile == null) {
            realImageFile = new ImageFile(imagePath);
        }
        realImageFile.display();
    }
}
