import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/* 2. Write java program to accept file name from user and open that file and display the contents on screen. */
public class program56_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file name to read: ");
        String fileName = sc.nextLine();

        File file = new File(fileName);
        try (Scanner fileReader = new Scanner(file)) {
            System.out.println("--- File Contents ---");
            while (fileReader.hasNextLine()) {
                System.out.println(fileReader.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
        sc.close();
    }
}
