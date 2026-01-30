import java.util.*;
import java.io.*;

/*
 * Question 2: Write a program in Java which accepts a directory name 
 * from user and display the name of the largest file (by size).
 */

class Program60_2 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter directory name: ");
        String name = sobj.nextLine();

        File fobj = new File(name);
        File[] fileList = fobj.listFiles();
        
        File maxFile = null;
        long maxSize = -1;

        if(fileList != null) {
            for(File f : fileList) {
                if(f.isFile() && f.length() > maxSize) {
                    maxSize = f.length();
                    maxFile = f;
                }
            }
            if(maxFile != null) {
                System.out.println("Largest file is: " + maxFile.getName() + " (" + maxSize + " bytes)");
            }
        }
    }
}