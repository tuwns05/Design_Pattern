package BEHAVIOURALPATTERN.IteratorPattern;

public class InStockIterator implements Iterator{
    private ItemCollection collection;
    private int index = 0;

    public InStockIterator(ItemCollection collection) {
        this.collection = collection;
    }

    @Override
    public void first() {
        index = 0;
        moveToNextInStock();
    }

    @Override
    public void next() {
        index++;
        moveToNextInStock();
    }

    private void moveToNextInStock() {
        while (!isDone() && !collection.getItem(index).isInStock()) {
            index++;
        }
    }

    @Override
    public boolean isDone() {
        return index >= collection.size();
    }

    @Override
    public Item currentItem() {
        if (isDone()) return null;
        return collection.getItem(index);
    }
}
