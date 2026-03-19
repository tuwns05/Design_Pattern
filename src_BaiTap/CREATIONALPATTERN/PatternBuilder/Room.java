package CREATIONALPATTERN.PatternBuilder;

public abstract class Room {
    protected int size;
    protected String color;

    public Room(int size, String wallColor) {
        this.size = size;
        this.color = wallColor;
    }

    @Override
    public String toString() {
        return "size=" + size + ", wallColor='" + color + "'";
    }
}
