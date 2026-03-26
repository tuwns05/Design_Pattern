package CREATIONALPATTERN.PatternBuilder;

public class KitchenRoom extends Room{

    public boolean hasRiceCooker;

    public KitchenRoom(int size, String wallColor, boolean hasRiceCooker) {
        super(size, wallColor);
        this.hasRiceCooker = hasRiceCooker;
    }

    @Override
    public String toString() {

        return "Living Room : "+size+" --- "+color+" ---"+hasRiceCooker+" ";
    }
}
