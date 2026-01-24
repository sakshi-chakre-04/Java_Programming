import java.io.File;
import java.util.Scanner;

public class program58_1 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter directory name:");
        String path = sobj.nextLine();

        File directory = new File(path);

        if (directory.exists() && directory.isDirectory()) {
            File[] fileList = directory.listFiles();
            System.out.println("Regular files in directory:");
            for (File file : fileList) {
                if (file.isFile()) { // Check if it's a regular file
                    System.out.println(file.getName());
                }
            }
        } else {
            System.out.println("Invalid directory path.");
        }
    }
}
