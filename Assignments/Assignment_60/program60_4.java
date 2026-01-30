import java.io.*;
import java.util.*;

/*
 * Question 4: Write a program in Java which accepts a directory name 
 * and file extension from user and display only files having that extension.
 */

class Program60_4 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter directory name: ");
        String dirName = sobj.nextLine();
        
        System.out.println("Enter file extension (e.g., .txt, .java): ");
        String ext = sobj.nextLine();

        File fobj = new File(dirName);
        File[] fileList = fobj.listFiles();

        if(fileList != null) {
            System.out.println("Files with extension " + ext + ":");
            for(File f : fileList) {
                if(f.isFile() && f.getName().endsWith(ext)) {
                    System.out.println(f.getName());
                }
            }
        }
    }
}