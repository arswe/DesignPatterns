public class Main {
    public static void main(String[] args) {
        var BrowseHistory = new BrowseHistory();
        BrowseHistory.push("a");
        BrowseHistory.push("b");
        BrowseHistory.push("c");

        Iterator iterator = (Iterator) BrowseHistory.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}