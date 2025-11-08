import java.util.Scanner;

public class SwitchDemo 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
    
        System.out.println("Enter your standard");
        int iStd = sobj.nextInt();

        switch (iStd) {
            case 1:
                System.out.println("Your exam is at 9 am. ");
                break;
            case 2:
                System.out.println("Your exam is at 10 am. ");
                break;
            case 3:
                System.out.println("Your exam is at 11 am. ");
                break;
            case 4:
                System.out.println("Your exam is at 12 pm. ");
                break;
        
            default:
                System.out.println("Invalid Standard.");
                break;
        }
    }
}
// if break statement is skipped then all the below lines gets executed after that condition ...
