import java.util.*;
import java.io.*;

/*
 * Question 2: Write a program in Java which accepts file name and integer N 
 * from user and copy first N bytes into a new file.
 */

class Program62_2 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String name = sobj.nextLine();
        System.out.println("Enter number of bytes (N): ");
        int n = sobj.nextInt();

        try (FileInputStream fio = new FileInputStream(name);
             FileOutputStream foo = new FileOutputStream("First_N_Bytes.txt")) {
            
            byte[] buffer = new byte[n];
            int bytesRead = fio.read(buffer, 0, n); // Read only up to N bytes
            
            if (bytesRead != -1) {
                foo.write(buffer, 0, bytesRead);
                System.out.println("First " + bytesRead + " bytes copied successfully.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}