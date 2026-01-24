import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/* 4. Write java program to accept file name from user and create new file of that name if it is not existing. */
public class program56_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the file to create: ");
        String fileName = sc.nextLine();

        File file = new File(fileName);
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
        sc.close();
    }
}
