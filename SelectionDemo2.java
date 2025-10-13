import java.util.Scanner;

public class SelectionDemo2 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        int iStd = 0;

        System.out.println("Enter your standard");
        iStd = sobj.nextInt();

        if(iStd == 1)
        {
            System.out.println("Your exam is at 9 am. ");
        }
        else if(iStd == 2)
        {
            System.out.println("Your exam is at 10 am. ");
        }
        else if(iStd == 3)
        {
            System.out.println("Your exam is at 11 am. ");
        }
        else if(iStd == 4)
        {
            System.out.println("Your exam is at 12 pm. ");
        }
        else
        {
            System.out.println("Invalid Standard");
        }
    }
}
