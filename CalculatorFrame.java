import javax.swing.*;
import java.awt.event.*;

class Calculator implements ActionListener
{
    JFrame fobj;
    JButton bobj;
    JLabel Number1label, Number2label, Resultlabel;
    JTextField tobj,t1obj;

    public Calculator(String title,int width, int height)
    {
        fobj = new JFrame(title);
        fobj.setSize(width,height);
        
        bobj = new JButton("+");
        bobj.setBounds(100,100,150,50);

        // bobj = new JButton("-");
        // bobj.setBounds();

        // bobj = new JButton("x");
        // bobj.setBounds();

        // bobj = new JButton("/");
        // bobj.setBounds();

        Number1label = new JLabel("Number 1 :");
        Number1label.setBounds(50,50,100,30);

        tobj = new JTextField();
        tobj.setBounds(150,50,150,30);

        Number2label = new JLabel("Number 2 :");
        Number2label.setBounds(100,100,100,30);

        t1obj = new JTextField();
        t1obj.setBounds(150,50,150,30);

        Resultlabel = new JLabel("Result :");
        Resultlabel.setBounds(150,250,100,30);

        fobj.add(bobj);
        fobj.add(tobj);
        fobj.add(t1obj);
        fobj.add(Number1label);
        fobj.add(Number2label);
        fobj.add(Resultlabel);

        //bobj.addActionListener(this);

        bobj.setLayout(null);
        fobj.add(bobj);

        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent aobj)
    {

    }
}

public class CalculatorFrame 
{
    public static void main(String[] A) 
    {
        MarvellousLogin mobj = new MarvellousLogin("Calculator",500,300);
    }
}
