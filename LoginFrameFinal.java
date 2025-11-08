import javax.swing.*;
import java.awt.event.*;

class MarvellousLogin implements ActionListener
{
    //characteristics
    JFrame fobj;
    JButton bobj;
    JTextField tobj;
    JPasswordField pobj;
    JLabel Userlabel, Passlabel, Resultlabel;

    public MarvellousLogin(String title, int width, int height)//resource allocation
    {
        fobj = new JFrame(title);
        fobj.setSize(width,height);

        Userlabel = new JLabel("User Name");
        Userlabel.setBounds(50,50,100,30);

        tobj = new JTextField();
        tobj.setBounds(150,50,150,30);

        Passlabel = new JLabel("Password");
        Passlabel.setBounds(50,100,100,30);

        pobj = new JPasswordField();
        pobj.setBounds(150,100,150,30);

        bobj = new JButton("Submit");
        bobj.setBounds(150,150,100,30);

        Resultlabel = new JLabel("");
        Resultlabel.setBounds(150,200,250,30);

        fobj.add(bobj);
        fobj.add(tobj);
        fobj.add(pobj);
        fobj.add(Userlabel);
        fobj.add(Passlabel);
        fobj.add(Resultlabel);

        bobj.addActionListener(this);

        fobj.setLayout(null);
        fobj.setSize(width,height);

        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //  Username : Marvellous
    //  Password : Marvellous@123

    public void actionPerformed(ActionEvent aobj) 
    {
        String uname = tobj.getText();
        String pass = pobj.getText();

        if((uname.equals("Marvellous"))&&(pass.equals("Marvellous@123")))
        {
            Resultlabel.setText("Login Successfull !");
        }
        else
        {
            Resultlabel.setText("Login Failed !");
        }
    }
}

public class LoginFrameFinal
{
    public static void main(String[] args) 
    {
        MarvellousLogin mobj = new MarvellousLogin("login",500,300);
    }
}
