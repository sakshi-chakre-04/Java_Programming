import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class program58_3 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.print("Enter directory name: ");
        String dirPath = sobj.nextLine();

        try (BufferedWriter bwriter = new BufferedWriter(new FileWriter("Marvellous.txt"))) {
            File folder = new File(dirPath);
            File[] listOfFiles = folder.listFiles();

            for (File file : listOfFiles) {
                if (file.isFile() && !file.getName().equals("Marvellous.txt")) {
                    List<String> lines = Files.readAllLines(file.toPath());
                    for (String line : lines) {
                        bwriter.write(line);
                        bwriter.newLine();
                    }
                }
            }
            System.out.println("Data merged into Marvellous.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
