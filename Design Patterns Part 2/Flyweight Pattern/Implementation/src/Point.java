public class Point {
    private int x; // 4 bytes
    private int y; // 4 bytes
    private PointIcon icon; // 4 bytes

    public Point(int x, int y, PointIcon icon) {
        this.x = x;
        this.y = y;
        this.icon = icon;
    }

    public void drown() {
        // why use printf -> printf is a method that allows us to format a string and print it to the console
        System.out.printf("%s at (%d, %d)", icon.getType(), x, y);
    }
}
