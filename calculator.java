import java.awt.*;
import java.awt.event.*;

//Abstract windows toolkit(Awt)

public class calculator implements ActionListener{
    int c,n;
    String s1,s2,s3,s4,s5;
    Frame frame;
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, button_add, button_sub, button_mul, button_div, button_eq, button_clr;
    Panel panel;
    TextField textfield;
    GridLayout gridlayout;
    calculator(){
        frame = new Frame("Calculator");
        frame.setLayout(new FlowLayout());
        panel = new Panel();
        button0 = new Button("0");
        button0.addActionListener(this);

        button1 = new Button("1");
        button1.addActionListener(this);

        button2 = new Button("2");
        button2.addActionListener(this);

        button3 = new Button("3");
        button3.addActionListener(this);

        button4 = new Button("4");
        button4.addActionListener(this);

        button5 = new Button("5");
        button5.addActionListener(this);

        button6 = new Button("6");
        button6.addActionListener(this);

        button7 = new Button("7");
        button7.addActionListener(this);

        button8 = new Button("8");
        button8.addActionListener(this);

        button9 = new Button("9");
        button9.addActionListener(this);

        button_add = new Button("+");
        button_add.addActionListener(this);

        button_sub = new Button("-");
        button_sub.addActionListener(this);

        button_mul = new Button("*");
        button_mul.addActionListener(this);

        button_div = new Button("/");
        button_div.addActionListener(this);

        button_eq = new Button("=");
        button_eq.addActionListener(this);

        button_clr = new Button("CLR");
        button_clr.addActionListener(this);

        textfield = new TextField(20);
        frame.add(textfield);
        gridlayout = new GridLayout(4,4);
        panel.setLayout(gridlayout);

        panel.add(button0);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);

        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);

        panel.add(button9);
        panel.add(button_add);
        panel.add(button_sub);
        panel.add(button_mul);

        panel.add(button_div);
        panel.add(button_eq);

        panel.add(button_clr);

        frame.add(panel);
        // panel.setSize(240, 170);
        frame.setSize(250,180);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setBackground(Color.CYAN);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button0){
            s3 = textfield.getText();
            s4 = "0";
            s5 = s3 + s4;
            textfield.setText(s5);
        }
        if(e.getSource()==button1){
            s3 = textfield.getText();
            s4 = "1";
            s5 = s3 + s4;
            textfield.setText(s5);
        }
        if(e.getSource()==button2){
            s3 = textfield.getText();
            s4 = "2";
            s5 = s3 + s4;
            textfield.setText(s5);
        }
        if(e.getSource()==button3){
            s3 = textfield.getText();
            s4 = "3";
            s5 = s3 + s4;
            textfield.setText(s5);
        }
        if(e.getSource()==button4){
            s3 = textfield.getText();
            s4 = "4";
            s5 = s3 + s4;
            textfield.setText(s5);
        }
        if(e.getSource()==button5){
            s3 = textfield.getText();
            s4 = "5";
            s5 = s3 + s4;
            textfield.setText(s5);
        }
        if(e.getSource()==button6){
            s3 = textfield.getText();
            s4 = "6";
            s5 = s3 + s4;
            textfield.setText(s5);
        }
        if(e.getSource()==button7){
            s3 = textfield.getText();
            s4 = "7";
            s5 = s3 + s4;
            textfield.setText(s5);
        }
        if(e.getSource()==button8){
            s3 = textfield.getText();
            s4 = "8";
            s5 = s3 + s4;
            textfield.setText(s5);
        }
        if(e.getSource()==button9){
            s3 = textfield.getText();
            s4 = "9";
            s5 = s3 + s4;
            textfield.setText(s5);
        }
        if(e.getSource()==button_add){
            s1 = textfield.getText();
            textfield.setText("");
            c = 1;
        }
        if(e.getSource()==button_sub){
            s1 = textfield.getText();
            textfield.setText("");
            c = 2;
        }
        if(e.getSource()==button_mul){
            s1 = textfield.getText();
            textfield.setText("");
            c = 3;
        }
        if(e.getSource()==button_div){
            s1 = textfield.getText();
            textfield.setText("");
            c = 4;
        }
        if(e.getSource()==button_eq){
            s2 = textfield.getText();
            if(c==1){
                n = Integer.parseInt(s1) + Integer.parseInt(s2);
                textfield.setText(String.valueOf(n));
            }
            if(c==2){
                n = Integer.parseInt(s1) - Integer.parseInt(s2);
                textfield.setText(String.valueOf(n));
            }
            if(c==3){
                n = Integer.parseInt(s1) * Integer.parseInt(s2);
                textfield.setText(String.valueOf(n));
            }
            if(c==4){
                n = Integer.parseInt(s1) / Integer.parseInt(s2);
                textfield.setText(String.valueOf(n));
            }
        }
        if(e.getSource()==button_clr){
            textfield.setText("");
        }
    }

    public static void main(String[] args) {
        calculator c = new calculator();
    }
}
