import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/* 3. Write java program to accept file name from user and open that file in write mode and write some data at the end of file. */
public class program56_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = sc.nextLine();
        System.out.print("Enter data to append: ");
        String data = sc.nextLine();

        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.write("\n" + data);
            System.out.println("Data successfully appended to the end of the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }
        sc.close();
    }
}
