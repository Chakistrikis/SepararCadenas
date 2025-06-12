package azc.uam;

import azc.uam.controller.TextController;
import azc.uam.model.LetterSeparator;
import azc.uam.model.LineSeparator;
import azc.uam.model.WordSeparator;
import azc.uam.view.ConsoleView;

public class Main {
    public static void main(String[] args) {
        TextController controller = new TextController();
        ConsoleView view = new ConsoleView();
        String input = "Hello \n this is a test";
        controller.setText(input);

        controller.useSeparator(new WordSeparator());
        view.showResult(controller.split());

        controller.useSeparator(new LineSeparator());
        view.showResult(controller.split());

        controller.useSeparator(new LetterSeparator());
        view.showResult(controller.split());
    }
}