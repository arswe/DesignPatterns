public class Main {
    public static void main(String[] args) {
        ConfigManager configManager = new ConfigManager();
        configManager.set("name", "akaid");

        System.out.println(configManager.get("name"));

    }
}