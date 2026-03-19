package CREATIONALPATTERN.PatternBuilder.Builder;

import CREATIONALPATTERN.PatternBuilder.Bedroom;

public class BedroomBuilder  {
    public String bedType;
    public int size;
    public boolean hasTV;
    public boolean hasAC;
    public boolean hasWindow;
    public boolean hasBalcony;
    public String color;
    public int numberOfLights;

    public BedroomBuilder setBedType(String bedType) {
        this.bedType = bedType;
        return this;
    }

    public BedroomBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    public BedroomBuilder setHasTV(boolean hasTV) {
        this.hasTV = hasTV;
        return this;
    }

    public BedroomBuilder setHasAC(boolean hasAC) {
        this.hasAC = hasAC;
        return this;
    }

    public BedroomBuilder setHasWindow(boolean hasWindow) {
        this.hasWindow = hasWindow;
        return this;
    }

    public BedroomBuilder setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
        return this;
    }

    public BedroomBuilder setColor(String color) {
        this.color = color;
        return this;
    }


    public BedroomBuilder setNumberOfLights(int numberOfLights) {
        this.numberOfLights = numberOfLights;
        return this;
    }
    public Bedroom build() {
        return new Bedroom(bedType,size,hasTV,hasAC,hasWindow,hasBalcony,color,numberOfLights);
    }


}
