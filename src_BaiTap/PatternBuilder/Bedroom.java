package PatternBuilder;

import PatternBuilder.Builder.BedroomBuilder;

public class Bedroom {
    private String bedType;
    private int size;
    private boolean hasTV;
    private boolean hasAC;
    private boolean hasWindow;
    private boolean hasBalcony;
    private String color;
    private int numberOfLights;

    // constructor private (chỉ builder dùng)
    public Bedroom(String bedType, int size, boolean hasTV, boolean hasAC, boolean hasWindow, boolean hasBalcony, String color, int numberOfLights) {
        this.bedType =  bedType;
        this.size =  size;
        this.hasTV =  hasTV;
        this.hasAC =  hasAC;
        this.hasWindow =  hasWindow;
        this.hasBalcony = hasBalcony;
        this.color =  color;
        this.numberOfLights =  numberOfLights;
    }



    @Override
    public String toString() {
        return "Bedroom{" +
                "bedType='" + bedType + '\'' +
                ", size=" + size +
                ", hasTV=" + hasTV +
                ", hasAC=" + hasAC +
                ", hasWindow=" + hasWindow +
                ", hasBalcony=" + hasBalcony +
                ", color='" + color + '\'' +
                ", numberOfLights=" + numberOfLights +
                '}';
    }
}
