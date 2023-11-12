public class Main {
    public static void main(String[] args) {
        var BrowseHistory = new BrowseHistory();
        BrowseHistory.push("a");
        BrowseHistory.push("b");
        BrowseHistory.push("c");

        for (var i = 0; i < BrowseHistory.getUrls().size(); i++)
            System.out.println(BrowseHistory.getUrls().get(i));
    }
}