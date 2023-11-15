public class ImageView {
    private Image image;
    private Filter filter;

    public ImageView(Image image) {
        this.image = image;
    }

    public void apply(Filter filter) {
        this.filter = filter;
        this.filter.apply(image);
    }
}
