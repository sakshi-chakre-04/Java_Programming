import java.util.*;

public class ExceptionDemo10
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        int Arr[]={10,20,30,40,50};
        int iIndex = 0, iData = 0;

        System.out.println("Enter the index number : ");
        iIndex = sobj.nextInt();

        try
        {
            System.out.println("Inside try");
            iData = Arr[iIndex];
        }
        catch(Exception eobj)       // generic catch
        {
            System.out.println("Inside catch");
        }
        finally
        {
            System.out.println("Inside finally");
        }
        
        System.out.println("Element at that index is : "+ iData);
    }    
}

// TIP : write the generic catch and that error to be used to write specific exception