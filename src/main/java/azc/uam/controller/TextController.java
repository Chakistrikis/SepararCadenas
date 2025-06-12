package azc.uam.controller;

import azc.uam.model.ISeparator;
import azc.uam.model.Text;

public class TextController {
    private final Text text;

    public TextController(){
        text = new Text();
    }

    public void setText(String input) {
        text.setText(input);
    }

    public void useSeparator(ISeparator separator){
        text.setSeparator(separator);
    }

    public String[] split(){
        return text.split();
    }
}
