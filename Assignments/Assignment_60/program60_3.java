import java.io.*;
import java.util.*;

/*
 * Question 3: Write a program in Java which accepts a directory name 
 * from user and display the name of the smallest file (by size).
 */

class Program60_3 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter directory name: ");
        String name = sobj.nextLine();

        File fobj = new File(name);
        File[] fileList = fobj.listFiles();
        
        File minFile = null;
        long minSize = Long.MAX_VALUE;

        if(fileList != null) {
            for(File f : fileList) {
                if(f.isFile() && f.length() < minSize) {
                    minSize = f.length();
                    minFile = f;
                }
            }
            if(minFile != null) {
                System.out.println("Smallest file is: " + minFile.getName() + " (" + minSize + " bytes)");
            }
        }
    }
}