public class Main {
    public static void main(String[] args) {
        var BrowseHistory = new BrowseHistory();
        BrowseHistory.push("a");
        BrowseHistory.push("b");
        BrowseHistory.push("c");

        var iterator = BrowseHistory.new ListIterator(BrowseHistory);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}