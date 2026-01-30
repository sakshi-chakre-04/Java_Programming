import java.io.*;
import java.util.*;

/*
 * Question 3: Write a program in Java which accepts source directory and 
 * destination directory and copy all files from source directory into destination directory.
 */

class program63_3 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter source directory: ");
        String srcDir = sobj.nextLine();
        System.out.println("Enter destination directory: ");
        String destDir = sobj.nextLine();

        File sDir = new File(srcDir);
        File dDir = new File(destDir);

        if (!dDir.exists()) dDir.mkdir();

        File[] files = sDir.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isFile()) {
                    try (FileInputStream fis = new FileInputStream(f);
                         FileOutputStream fos = new FileOutputStream(new File(dDir, f.getName()))) {
                        byte[] buffer = new byte[1024];
                        int len;
                        while ((len = fis.read(buffer)) != -1) fos.write(buffer, 0, len);
                    } catch (Exception e) { System.out.println("Error copying " + f.getName()); }
                }
            }
            System.out.println("All files copied to " + destDir);
        }
    }
}