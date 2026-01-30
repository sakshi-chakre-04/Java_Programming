import java.io.*;

/*
 * Question 5: Write a program in Java which reads first 1 KB data from 
 * Combined.bin and writes it into a new output file.
 */

class program63_5 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("Combined.bin");
             FileOutputStream fos = new FileOutputStream("Extracted_Data.txt")) {
            
            byte[] buffer = new byte[1024]; // 1 KB
            int bytesRead = fis.read(buffer, 0, 1024);
            
            if (bytesRead != -1) {
                fos.write(buffer, 0, bytesRead);
                System.out.println("First 1 KB extracted to Extracted_Data.txt");
            } else {
                System.out.println("Combined.bin is empty.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: Combined.bin not found. Run Program63_4 first.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}