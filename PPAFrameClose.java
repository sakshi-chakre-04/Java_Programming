import javax.swing.*;

class PPAFrameClose
{
    public static void main(String[] args) 
    {
        JFrame fobj = new JFrame("PPA");
        fobj.setSize(300,300);
        fobj.setVisible(true);  //render the frame

        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}