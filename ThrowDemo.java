import java.util.Scanner;

class Demo
{
    public int Division(int No1, int No2) throws ArithmeticException 
    {
        int Ans = 0;
        Ans = No1 / No2;
        return Ans;
    }
}

class AgeInvalidException extends Exception
{
    public AgeInvalidException(String str)
    {
        super(str);
    }
}

public class ThrowDemo 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your age : ");
        int iAge = sobj.nextInt();

        try
        {
            if(iAge < 18)            
            {
                throw new AgeInvalidException("Your age is below 18 .");
            }
        }
        catch(AgeInvalidException aobj)
        {
            System.out.println(aobj);
        }

        // if(iAge < 18)            //this will throw err as telling jvm only that err without handle
        // {
        //     throw new AgeInvalidException("your age is below 18 .");
        // }
    }
}
