import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class program58_4 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.print("Enter directory name: ");
        String dirPath = sobj.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Marvellous.txt"))) {
            File folder = new File(dirPath);
            for (File file : folder.listFiles()) {
                if (file.isFile() && !file.getName().equals("Marvellous.txt")) {
                    writer.write("--- File Name: " + file.getName() + " ---\n");
                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    String line;
                    while ((line = reader.readLine()) != null) {
                        writer.write(line + "\n");
                    }
                    writer.write("\n");
                    reader.close();
                }
            }
            System.out.println("Data and names written to Marvellous.txt");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
