import javax.swing.*;
import java.awt.event.*;

class EventHandling1
{
    public static void main(String[] args) 
    {
        JFrame fobj = new JFrame("PPA");

        JButton bobj = new JButton("OK");

        bobj.setBounds(100, 100, 150, 50);

        bobj.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent aobj)
            {
                //  Logic
                System.out.println("Button Clicked...");//this is CUI
            }
        });

        fobj.add(bobj);

        fobj.setSize(400,300);

        fobj.setLayout(null);
        fobj.setVisible(true);  //render the frame

        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

//next->EventHandlingSeparateClass