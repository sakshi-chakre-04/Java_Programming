import java.io.*;
import java.util.*;

/*
 * Question 5: Write a program in Java which accepts file name from user 
 * and split that file into two separate files (first half and second half).
 */

class Program61_5 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter file name to split: ");
        String name = sobj.nextLine();

        File fobj = new File(name);
        if (!fobj.exists()) {
            System.out.println("File does not exist.");
            return;
        }

        long fileSize = fobj.length();
        long halfSize = fileSize / 2;

        try (FileInputStream fio = new FileInputStream(fobj);
             FileOutputStream foo1 = new FileOutputStream("Part1_" + name);
             FileOutputStream foo2 = new FileOutputStream("Part2_" + name)) {
            
            int data;
            long currentByte = 0;

            while ((data = fio.read()) != -1) {
                if (currentByte < halfSize) {
                    foo1.write(data);
                } else {
                    foo2.write(data);
                }
                currentByte++;
            }
            System.out.println("File split into Part1_" + name + " and Part2_" + name);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}