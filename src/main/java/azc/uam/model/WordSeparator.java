package azc.uam.model;

public class WordSeparator implements ISeparator{
    @Override
    public String[] separate(Text text) {
        return text.getText().split("\\s+");
    }
}
