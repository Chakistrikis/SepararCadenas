package azc.uam.model;

public class Text implements ISeparator {
    private String text;

    public Text() {}

    public Text(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void split(){

    }

    @Override
    public String[] separate(Text text) {
        return new String[0];
    }
}
