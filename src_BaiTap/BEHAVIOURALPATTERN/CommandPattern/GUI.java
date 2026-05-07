package BEHAVIOURALPATTERN.CommandPattern;

public class GUI {
    public static void main(String[] args) {
        Document document = new Document();

        Command saveCommand = new SaveCommand(document);
        Command printCommand = new PrintCommand(document);

        Button saveButton = new Button(saveCommand);
        Button printButton = new Button(printCommand);

        saveButton.click();
        printButton.click();
    }
}
