import java.util.Iterator;

public class BrowseHistory {
    private String[] urls = new String[10];
    private int count;

    public void push(String url) {
        urls[count++] = url;
    }

    public String pop() {
        return urls[--count];
    }

    public Iterator createIterator() {
        return new ArrayIterator();
    }

    public class ArrayIterator implements Iterator<String> {

        private BrowseHistory history;
        private int index;

        public ArrayIterator() {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.count);
        }



        @Override
        public String next() {
            return history.urls[index++];
        }
    }
}
