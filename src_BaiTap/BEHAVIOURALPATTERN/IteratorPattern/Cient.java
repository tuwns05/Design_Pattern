package BEHAVIOURALPATTERN.IteratorPattern;

public class Cient {
    public static void main(String[] args) {
        ItemCollection collection = new ItemCollection();

        collection.addItem(new Item("Laptop", true));
        collection.addItem(new Item("Mouse", false));
        collection.addItem(new Item("Keyboard", true));
        collection.addItem(new Item("Monitor", false));

        Iterator iterator = collection.createIterator();

        for (iterator.first(); !iterator.isDone(); iterator.next()) {
            Item item = iterator.currentItem();
            System.out.println(item.getName());
        }
    }
}
