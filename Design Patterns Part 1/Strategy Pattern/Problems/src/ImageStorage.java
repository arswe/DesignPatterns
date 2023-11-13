public class ImageStorage {
    private String compressor;
    private String filter;

    public ImageStorage(String compressor, String filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String fileName) {
        // JPEG, GIF, PNG
        if (compressor == "JPEG")
            System.out.println("Compressing using JPEG");
        else if (compressor == "PNG")
            System.out.println("Compressing using PNG");
        else if (compressor == "GIF")
            System.out.println("Compressing using GIF");

        // B&W, High Contrast
        if (filter == "B&W")
            System.out.println("Applying B&W filter");
        else if (filter == "High Contrast")
            System.out.println("Applying High Contrast filter");

    }
}
