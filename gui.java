import javax.swing.*;
import java.awt.*;
//Access modifier
class gui {
    public static void main(String args[]) {
        JFrame frame = new JFrame("MUSTAPHA ABDULAZIZ");//create a frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setLocation(400,200);
        frame.setBackground(Color.PINK);
        

        //create buttons
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");

        //add color

        
        //add buttons to frame using Borderlayout
        frame.setLayout(new BorderLayout());//borderlayout as the layout of the frame
        frame.add(button1,BorderLayout.NORTH);
        frame.add(button2,BorderLayout.SOUTH);
        frame.add(button3,BorderLayout.EAST);
        frame.add(button4,BorderLayout.WEST);
        frame.add(button5,BorderLayout.CENTER);
        // Text field
        // JTextField text = new JTextField();
        // frame.add(text);

        //add button to frame using flow layout
        // frame.setLayout(new FlowLayout());
        // frame.add(button1);
        // frame.add(button2);
        // frame.add(button3);
        // frame.add(button4);
        // frame.add(button5);


        //add buttons to frame using gridlayout
        // frame.setLayout(new GridLayout(5, 1));
        // frame.add(button1);
        // frame.add(button1);
        frame.setVisible(true);
    }
}
