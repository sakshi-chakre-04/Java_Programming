import java.io.File;
import java.util.Scanner;

public class program57_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        File file = new File(sc.next());

        if (file.exists()) {
            if (file.isFile()) {
                System.out.println("It is a regular file.");
            } else {
                System.out.println("It exists, but it is not a regular file (e.g., it's a directory).");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
}
