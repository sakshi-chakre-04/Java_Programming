import java.io.*;
import java.util.*;

/*
 * Question 4: Write a program in Java which accepts directory name and 
 * create a file Combined.bin that stores data of all files sequentially.
 */

class program63_4 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter directory name: ");
        String dirName = sobj.nextLine();

        File dir = new File(dirName);
        File[] files = dir.listFiles();

        try (FileOutputStream fos = new FileOutputStream("Combined.bin")) {
            if (files != null) {
                for (File f : files) {
                    if (f.isFile()) {
                        FileInputStream fis = new FileInputStream(f);
                        byte[] buffer = new byte[1024];
                        int len;
                        while ((len = fis.read(buffer)) != -1) {
                            fos.write(buffer, 0, len);
                        }
                        fis.close();
                    }
                }
                System.out.println("Combined.bin created successfully.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}