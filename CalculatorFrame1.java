import javax.swing.*;
import java.awt.event.*;

class Calculator implements ActionListener
{
    JFrame fobj;
    JButton addBtn, subBtn, multBtn, divBtn;
    JLabel Number1label, Number2label, Resultlabel;
    JTextField tobj,t1obj;

    public Calculator(String title,int width, int height)
    {
        fobj = new JFrame(title);
        fobj.setSize(width,height);
        fobj.setLayout(null);

        addBtn = new JButton("+");
        addBtn.setBounds(40, 140, 70, 40);

        subBtn = new JButton("-");
        subBtn.setBounds(120, 140, 70, 40);

        multBtn = new JButton("*");
        multBtn.setBounds(200, 140, 70, 40);

        divBtn = new JButton("/");
        divBtn.setBounds(280, 140, 70, 40);

        Number1label = new JLabel("Number 1 :");
        Number1label.setBounds(30, 30, 100, 30);

        tobj = new JTextField();
        tobj.setBounds(150,50,150,30);

        Number2label = new JLabel("Number 2 :");
        Number2label.setBounds(30, 80, 100, 30);

        t1obj = new JTextField();
        t1obj.setBounds(1130, 80, 120, 30);

        Resultlabel = new JLabel("Result :");
        Resultlabel.setBounds(30, 210, 340, 30);

        fobj.add(addBtn);
		fobj.add(subBtn);
		fobj.add(multBtn);
		fobj.add(divBtn);
        fobj.add(tobj);
        fobj.add(t1obj);
        fobj.add(Number1label);
        fobj.add(Number2label);
        fobj.add(Resultlabel);

        addBtn.addActionListener(this);
        subBtn.addActionListener(this);
        multBtn.addActionListener(this);
        divBtn.addActionListener(this);

        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent aobj) {
        String cmd = aobj.getActionCommand();   // "+", "-", "*", "/"
        String s1 = tobj.getText().trim();
        String s2 = t1obj.getText().trim();

        // Basic validation
        if (s1.isEmpty() || s2.isEmpty()) {
            Resultlabel.setText("Result : enter both numbers");
            return;
        }

        double n1, n2;
        try {
            // parse directly from input strings
            n1 = Double.parseDouble(s1);
            n2 = Double.parseDouble(s2);
        } catch (NumberFormatException ex) {
            Resultlabel.setText("Result : invalid number");
            return;
        }

        // do the operation
        double res;
        switch (cmd) {
            case "+":
                res = n1 + n2;
                break;
            case "-":
                res = n1 - n2;
                break;
            case "*":
                res = n1 * n2;
                break;
            case "/":
                if (n2 == 0) {
                    Resultlabel.setText("Result : cannot divide by zero");
                    return;
                }
                res = n1 / n2;
                break;
            default:
                Resultlabel.setText("Result : unknown operation");
                return;
        }

        // show result (simple formatting)
        if (res == (long) res) {
            Resultlabel.setText("Result : " + String.format("%d", (long) res));
        } else {
            Resultlabel.setText("Result : " + res);
        }
    }
}

public class CalculatorFrame1
{
    public static void main(String[] A) 
    {
        MarvellousLogin mobj = new MarvellousLogin("Calculator",420, 320);
    }
}
