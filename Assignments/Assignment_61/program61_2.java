import java.util.*;
import java.io.*;

/*
 * Question 2: Write a program in Java which accepts source file name and 
 * destination file name from user and copy data using byte[] buffer.
 */

class Program61_2 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter source file name: ");
        String src = sobj.nextLine();
        System.out.println("Enter destination file name: ");
        String dest = sobj.nextLine();

        try (FileInputStream fio = new FileInputStream(src);
             FileOutputStream foo = new FileOutputStream(dest)) {
            
            byte[] buffer = new byte[1024]; // 1KB buffer
            int bytesRead;
            
            while ((bytesRead = fio.read(buffer)) != -1) {
                foo.write(buffer, 0, bytesRead);
            }
            System.out.println("File copied successfully using buffer.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}