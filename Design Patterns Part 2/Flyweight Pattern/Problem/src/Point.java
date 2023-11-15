public class Point {
    private int x;
    private int y;
    private PointType type;
    private byte[] icon;

    public Point(int x, int y, PointType type, byte[] icon) {
        this.x = x;
        this.y = y;
        this.type = type;
        this.icon = icon;
    }

    public void drown() {
        // why use printf -> printf is a method that allows us to format a string and print it to the console
        System.out.printf("%s at (%d, %d)", type, x, y);
    }
}
