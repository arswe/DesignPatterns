public class Main {
    public static void main(String[] args) {
        var composite = new CompositeCommand();
        composite.addCommand(new ResizeCommand());
        composite.addCommand(new BlackAndWhiteCommand());
        composite.execute();
        composite.execute();
    }
}