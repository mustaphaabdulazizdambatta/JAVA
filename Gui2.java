import javax.swing.*;
import java.awt.*;

public class Gui2{
    public static void main(String args[]) {
        JFrame myframe = new JFrame("MY FRAME");
        myframe.setSize(300, 300);
        myframe.setLocation(250, 200);
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.setVisible(true);
        myframe.setLayout(new BorderLayout());

        //Create a button

        JButton mybutton1 = new JButton("button1");
        JButton mybutton2 = new JButton("button1");
        JButton mybutton3 = new JButton("button1");
        JButton mybutton4 = new JButton("button1");

        //add buttons to frame
        myframe.add(mybutton1, BorderLayout.NORTH);
        myframe.add(mybutton2, BorderLayout.EAST);
        myframe.add(mybutton3, BorderLayout.SOUTH);
        myframe.add(mybutton4, BorderLayout.CENTER);
    }
}