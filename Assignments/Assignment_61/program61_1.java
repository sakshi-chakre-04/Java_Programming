import java.io.*;
import java.util.*;

/*
 * Question 1: Write a program in Java which accepts source file name and 
 * destination file name from user and copy data from source to destination (byte by byte).
 */

class Program61_1 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter source file name: ");
        String src = sobj.nextLine();
        System.out.println("Enter destination file name: ");
        String dest = sobj.nextLine();

        try (FileInputStream fio = new FileInputStream(src);
             FileOutputStream foo = new FileOutputStream(dest)) {
            
            int data;
            while ((data = fio.read()) != -1) {
                foo.write(data);
            }
            System.out.println("File copied successfully byte by byte.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}