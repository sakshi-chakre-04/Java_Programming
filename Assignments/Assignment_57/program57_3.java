import java.io.File;
import java.util.Scanner;

public class program57_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter directory name to create: ");
        File dir = new File(sc.next());

        if (dir.mkdir()) {
            System.out.println("Directory created successfully.");
        } else {
            System.out.println("Failed to create directory (it may already exist).");
        }
    }
}
