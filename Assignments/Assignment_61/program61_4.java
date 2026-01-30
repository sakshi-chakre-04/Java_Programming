import java.io.*;
import java.util.*;

/*
 * Question 4: Write a program in Java which accepts two input file names 
 * and one output file name and merge both files into the output file.
 */

class Program61_4 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter first input file: ");
        String file1 = sobj.nextLine();
        System.out.println("Enter second input file: ");
        String file2 = sobj.nextLine();
        System.out.println("Enter output file name: ");
        String output = sobj.nextLine();

        try (FileOutputStream foo = new FileOutputStream(output);
             FileInputStream fio1 = new FileInputStream(file1);
             FileInputStream fio2 = new FileInputStream(file2)) {
            
            byte[] buffer = new byte[1024];
            int length;

            // Read from first file
            while ((length = fio1.read(buffer)) != -1) {
                foo.write(buffer, 0, length);
            }
            // Read from second file
            while ((length = fio2.read(buffer)) != -1) {
                foo.write(buffer, 0, length);
            }
            
            System.out.println("Files merged successfully.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}