package BEHAVIOURALPATTERN.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class ItemCollection implements Aggregate{
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public Item getItem(int index) {
        return items.get(index);
    }

    public int size() {
        return items.size();
    }

    @Override
    public Iterator createIterator() {
        return new InStockIterator(this);
    }
}
