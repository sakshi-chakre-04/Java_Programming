import java.util.*;
import java.io.*;

/*
 * Question 4: Write a program in Java which accepts a directory name 
 * from user and display count of total files and total folders.
 */

class Program59_4 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter directory name: ");
        String name = sobj.nextLine();

        File fobj = new File(name);
        File[] fileList = fobj.listFiles();

        int fileCount = 0;
        int dirCount = 0;

        if(fileList != null) {
            for(File f : fileList) {
                if(f.isFile()) {
                    fileCount++;
                } else if(f.isDirectory()) {
                    dirCount++;
                }
            }
            System.out.println("Total number of files: " + fileCount);
            System.out.println("Total number of folders: " + dirCount);
        }
    }
}