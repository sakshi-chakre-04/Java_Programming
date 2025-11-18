import javax.swing.*;
import java.awt.event.*;

class Calculator implements ActionListener {
    JFrame fobj;
    JButton addBtn, subBtn, mulBtn, divBtn;
    JLabel Number1label, Number2label, Resultlabel;
    JTextField tobj, t1obj;

    public Calculator(String title, int width, int height) {
        fobj = new JFrame(title);
        fobj.setSize(width, height);
        fobj.setLayout(null); // absolute positioning

        // Labels and text fields
        Number1label = new JLabel("Number 1 :");
        Number1label.setBounds(30, 30, 100, 30);
        fobj.add(Number1label);

        tobj = new JTextField();
        tobj.setBounds(130, 30, 120, 30);
        fobj.add(tobj);

        Number2label = new JLabel("Number 2 :");
        Number2label.setBounds(30, 80, 100, 30);
        fobj.add(Number2label);

        t1obj = new JTextField();
        t1obj.setBounds(130, 80, 120, 30);
        fobj.add(t1obj);

        // Operation buttons
        addBtn = new JButton("+");
        addBtn.setBounds(40, 140, 70, 40);
        addBtn.addActionListener(this);
        fobj.add(addBtn);

        subBtn = new JButton("-");
        subBtn.setBounds(120, 140, 70, 40);
        subBtn.addActionListener(this);
        fobj.add(subBtn);

        mulBtn = new JButton("*");
        mulBtn.setBounds(200, 140, 70, 40);
        mulBtn.addActionListener(this);
        fobj.add(mulBtn);

        divBtn = new JButton("/");
        divBtn.setBounds(280, 140, 70, 40);
        divBtn.addActionListener(this);
        fobj.add(divBtn);

        // Result label
        Resultlabel = new JLabel("Result :");
        Resultlabel.setBounds(30, 210, 340, 30); // wide so we can show result text
        fobj.add(Resultlabel);

        // Frame settings
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fobj.setLocationRelativeTo(null); // center on screen
        fobj.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent aobj) {
        String cmd = aobj.getActionCommand();
        String s1 = tobj.getText().trim();
        String s2 = t1obj.getText().trim();

        if (s1.isEmpty() || s2.isEmpty()) {
            Resultlabel.setText("Result : Please enter both numbers.");
            return;
        }

        double n1, n2;
        try {
            n1 = Double.parseDouble(s1);
            n2 = Double.parseDouble(s2);
        } catch (NumberFormatException ex) {
            Resultlabel.setText("Result : Invalid number format.");
            return;
        }

        double res = 0;
        boolean ok = true;

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
                    Resultlabel.setText("Result : Cannot divide by zero.");
                    ok = false;
                } else {
                    res = n1 / n2;
                }
                break;
            default:
                ok = false;
                Resultlabel.setText("Result : Unknown operation.");
        }

        if (ok) {
            // If result is whole number, display without decimal .0
            if (res == (long) res) {
                Resultlabel.setText("Result : " + String.format("%d", (long) res));
            } else {
                Resultlabel.setText("Result : " + String.format("%s", res));
            }
        }
    }
}

public class CalculatorFrame2 {
    public static void main(String[] args) {
        // create calculator frame (title, width, height)
        new Calculator("Calculator", 420, 320);
    }
}
