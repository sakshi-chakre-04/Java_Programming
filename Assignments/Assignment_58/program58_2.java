import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class program58_2 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter directory name:");
        String dirPath = sobj.nextLine();

        File directory = new File(dirPath);
        File outputFile = new File("Marvellous.txt");

        try (PrintWriter writer = new PrintWriter(new FileWriter(outputFile))) {
            if (directory.exists() && directory.isDirectory()) {
                File[] fileList = directory.listFiles();
                for (File file : fileList) {
                    if (file.isFile()) {
                        writer.println(file.getName());
                    }
                }
                System.out.println("File names written to Marvellous.txt successfully.");
            } else {
                System.out.println("Invalid directory.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
