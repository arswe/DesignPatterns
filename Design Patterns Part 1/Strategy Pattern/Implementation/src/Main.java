public class Main {
    public static void main(String[] args) {
        var imageStorage = new ImageStorage();
        imageStorage.store("a", new JpegCompressor(), new BlackAndWhiteFilter());
        System.out.println("-----");
        imageStorage.store("a", new PngCompressor(), new BlackAndWhiteFilter());
        System.out.println("-----");
        imageStorage.store("a", new JpgCompressor(), new BlackAndWhiteFilter());
    }
}