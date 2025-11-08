import javax.swing.*;

class PPAFrameComponents
{
    public static void main(String[] args) 
    {
        JFrame fobj = new JFrame("PPA");

        JButton bobj = new JButton("OK");

        fobj.add(bobj);
        fobj.setSize(300,300);
        fobj.setVisible(true);  //render the frame

        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

//e.g. plate and bowl