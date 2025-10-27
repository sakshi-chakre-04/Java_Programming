import java.util.*;

public class ExceptionDemo4 
{
    public static void main(String[] args) 
    {
        int iAns = 0;
        int iNo1 = 0;
        int iNo2 = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number : ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter first number : ");
        iNo2 = sobj.nextInt();

        try
        {
            System.out.println("Inside try block");
            iAns = iNo1/iNo2;
        }
        catch(ArithmeticException aobj)
        {
            System.out.println("Inside catch block");
            System.out.println(aobj);
        }
        
        System.out.println("Division is : "+iAns);
    }    
}