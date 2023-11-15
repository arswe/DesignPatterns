
public interface Filter {
    void apply(Image image);

    class Caramel {
        public void init() {
            System.out.println("Caramel.init");
        }

        public void render(Image image) {
            System.out.println("Applying Caramel Filter");
        }
    }
}
