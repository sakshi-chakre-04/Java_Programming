import java.io.*;
import java.util.*;

/*
 * Question 1: Write a program in Java which accepts source and destination 
 * file names and copy file using BufferedInputStream and BufferedOutputStream.
 */

class program63_1 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter source file name: ");
        String src = sobj.nextLine();
        System.out.println("Enter destination file name: ");
        String dest = sobj.nextLine();

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {
            
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            System.out.println("File copied successfully using Buffered Streams.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}