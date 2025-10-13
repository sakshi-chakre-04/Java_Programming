import java.util.Scanner;

public class Dynamic {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        int length = 0;
        int Arr[];

        System.out.println("Enter the number of elements : ");
        length = sobj.nextInt();

        Arr = new int[length];
        if (Arr == null) 
        {
            System.out.println("unable to allocate the memory.");
        } else {
            System.out.println("memory gets successfully allocated.");
        }

        Arr = null;
        System.gc();
    }
}
