import java.awt.*;
import javax.swing.*;
public class Registrator {
    public static void main(String []args) {
        TextField textfield;
        Panel panel;
        // panel.setLayout(gridlayout);
        panel = new Panel();
        JFrame frame = new JFrame("Registration");
        frame.setVisible(true);
        frame.setSize(1030, 700);
        textfield = new TextField(20);
        panel.add(textfield);
    }
}