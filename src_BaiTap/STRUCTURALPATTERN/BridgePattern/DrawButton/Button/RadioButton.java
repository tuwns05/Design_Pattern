package STRUCTURALPATTERN.BridgePattern.DrawButton.Button;

import STRUCTURALPATTERN.BridgePattern.DrawButton.ButtonSize.ButtonSize;

public class RadioButton extends Button{

    public RadioButton(ButtonSize size) {
        super(size);
    }

    public void Draw() {
        System.out.println("Radio button size: ");
        size.ApplySize();
    }
}
