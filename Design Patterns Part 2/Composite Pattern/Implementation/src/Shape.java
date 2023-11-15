public class Shape implements Component {
    @Override
    public void render() {
        System.out.println("Rendering shape");
    }

    @Override
    public void move() {
        System.out.println("Moving shape");
    }
}
