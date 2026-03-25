package STRUCTURALPATTERN.BridgePattern.DrawButton.Button;

import STRUCTURALPATTERN.BridgePattern.DrawButton.ButtonSize.ButtonSize;

public abstract class Button {
      protected ButtonSize size;

      public Button(ButtonSize size) {
            this.size = size;
      }

      public abstract void Draw();
}
