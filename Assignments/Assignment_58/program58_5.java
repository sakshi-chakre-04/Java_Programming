import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class program58_5 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.print("Enter directory name: ");
        String dirPath = sobj.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Marvellous.txt"))) {
            File folder = new File(dirPath);
            for (File file : folder.listFiles()) {
                if (file.isFile() && !file.getName().equals("Marvellous.txt")) {
                    // Header with metadata
                    writer.write("Name: " + file.getName() + " | Size: " + file.length() + " bytes\n");
                    writer.write("Content:\n");
                    
                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    String line;
                    while ((line = reader.readLine()) != null) {
                        writer.write(line + "\n");
                    }
                    writer.write("\n----------------------------\n");
                    reader.close();
                }
            }
            System.out.println("Task completed. Check Marvellous.txt");
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }
    }
}
