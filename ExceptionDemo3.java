import java.util.Scanner;

public class ExceptionDemo3 
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

        iAns = iNo1/iNo2;
        System.out.println("Division is : "+iAns);
    }    
}

// the main thread is always active in java , garbage collector is a thread in java
//e.g. body-> consisting of various thread...