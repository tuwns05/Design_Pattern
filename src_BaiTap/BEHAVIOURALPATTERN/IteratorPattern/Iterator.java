package BEHAVIOURALPATTERN.IteratorPattern;

public interface Iterator {
    void first();
    void next();
    boolean isDone();
    Item currentItem();
}
