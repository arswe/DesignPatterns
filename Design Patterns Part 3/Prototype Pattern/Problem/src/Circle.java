public class Circle implements Component {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void render() {
        System.out.println("Render Circle");
    }
}
