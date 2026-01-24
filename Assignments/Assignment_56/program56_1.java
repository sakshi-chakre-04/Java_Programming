import java.io.File;
import java.util.Scanner;

/* 1. Write java program to accept file name from user and open that file. */
public class program56_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file name to open: ");
        String fileName = sc.nextLine();

        File file = new File(fileName);

        if (file.exists()) {
            System.out.println("File opened successfully: " + file.getAbsolutePath());
        } else {
            System.out.println("File does not exist.");
        }
        sc.close();
    }
}
