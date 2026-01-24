import java.io.File;
import java.util.Scanner;

/* 5. Write java program to accept directory name from user and display all names of files from that directory. */
public class program56_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the directory path: ");
        String dirName = sc.nextLine();

        File directory = new File(dirName);

        if (directory.exists() && directory.isDirectory()) {
            String[] files = directory.list();
            System.out.println("Files in directory '" + dirName + "':");
            if (files != null && files.length > 0) {
                for (String fileName : files) {
                    System.out.println(fileName);
                }
            } else {
                System.out.println("The directory is empty.");
            }
        } else {
            System.out.println("Invalid directory path.");
        }
        sc.close();
    }
}
