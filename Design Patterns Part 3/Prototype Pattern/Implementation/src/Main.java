public class Main {
    public static void main(String[] args) {
        ContextManu contextManu = new ContextManu();
        Circle circle = new Circle();
        circle.setRadius(5);
        contextManu.duplicate(circle);
    }
}