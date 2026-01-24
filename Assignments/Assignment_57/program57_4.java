import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.zip.CRC32;

public class program57_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name for checksum: ");
        File file = new File(sc.next());

        try (FileInputStream fis = new FileInputStream(file)) {
            CRC32 crc = new CRC32();
            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                crc.update(buffer, 0, bytesRead);
            }
            System.out.println("Checksum (CRC32): " + crc.getValue());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
