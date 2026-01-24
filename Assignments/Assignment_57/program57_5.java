import java.io.File;
import java.util.Scanner;

public class program57_5 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter directory name: ");
        File folder = new File(sc.next());

        if (folder.isDirectory()) {
            File[] fileList = folder.listFiles();
            if (fileList != null) {
                System.out.println("File Name \t\t Size (Bytes)");
                for (File f : fileList) {
                    if (f.isFile()) {
                        System.out.println(f.getName() + " \t\t " + f.length());
                    }
                }
            }
        } else {
            System.out.println("The provided name is not a directory.");
        }
    }    
}
