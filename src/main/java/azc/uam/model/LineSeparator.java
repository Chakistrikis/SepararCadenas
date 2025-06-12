package azc.uam.model;

public class LineSeparator implements ISeparator{
    @Override
    public String[] separate(Text text) {
        return text.getText().split("\n");
    }
}
