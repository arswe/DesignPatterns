public class PointIcon {
    private final PointType type; // 4 bytes
    private final byte[] icon; // 20 kb -> 20 MB

    public PointIcon(PointType type, byte[] icon) {
        this.type = type;
        this.icon = icon;
    }

    public PointType getType() {
        return type;
    }
}