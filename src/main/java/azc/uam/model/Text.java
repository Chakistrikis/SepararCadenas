package azc.uam.model;

public class Text {
    private String text;
    private ISeparator separator;

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

    public void setSeparator(ISeparator separator){
        this.separator = separator;
    }

    public String[] split(){
        String[] elements;
        elements = separator.separate(this);
        return elements;
    }
}
