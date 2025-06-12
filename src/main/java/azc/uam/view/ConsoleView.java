package azc.uam.view;

public class ConsoleView {
    public void showResult(String[] elements){
        for(String s: elements){
            System.out.println(" - " + s);
        }
        System.out.println("");
    }
}
