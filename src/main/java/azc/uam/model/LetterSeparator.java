package azc.uam.model;

public class LetterSeparator implements ISeparator {

    @Override
    public String[] separate(Text text) {
        return text.getText().split("");
    }
}
