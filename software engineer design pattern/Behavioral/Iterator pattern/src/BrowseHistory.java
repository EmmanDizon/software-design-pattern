import java.util.ArrayList;
import java.util.Iterator;
import  java.util.List;
import java.util.ListIterator;

public class BrowseHistory {
    private List<String> urls = new ArrayList<>();

    public void push(String url) {
        urls.add(url);
    }

    public String pop() {
        var lastIndex = urls.size() - 1;
        var lastUrl = urls.get(lastIndex);

        urls.remove(lastUrl);

        return lastUrl;
    }
    public IIterator createIterator() {
        return  new ListIterator(this);
    }

    public class ListIterator implements IIterator<String> {

        private BrowseHistory history;
        private int index;

        public ListIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.urls.size());
        }

        @Override
        public String current() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
