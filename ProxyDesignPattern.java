abstract class Image {
    abstract void display();
}

class RealImage extends Image {
    private final String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromDisk(filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + filename);
    }

    private void loadImageFromDisk(String filename) {
        System.out.println("Loading image from disk: " + filename);
    }
}

class ProxyImage extends Image {
    private RealImage realImage;
    private final String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}

public class ProxyDesignPattern {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("example.jpg");
        image1.display();
    }
}
