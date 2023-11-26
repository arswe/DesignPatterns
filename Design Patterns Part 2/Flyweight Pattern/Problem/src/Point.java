public class Point {
    private int x; // 4 bytes
    private int y; // 4 bytes
    private PointType type; // 4 bytes
    private byte[] icon; // 20 kb -> 20 MB

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
