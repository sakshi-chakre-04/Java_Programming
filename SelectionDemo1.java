import java.util.Scanner;

public class SelectionDemo1 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        int iAge = 0;

        System.out.println("Enter your age  : ");
        iAge = sobj.nextInt();

        if(iAge>=18)
        {
            System.out.println("You can vote.");
        }
        else
        {
            System.out.println("You are not eligible to vote.");
        }
    }
}
