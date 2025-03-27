package FileIOStream;

import java.io.*;

public class InputOutput {
    public static void main(String[] args) {
        try {
            String path1="/Users/ghanshyammandal/Documents/IOFiles/input.rtf";
            String path2="/Users/ghanshyammandal/Documents/IOFiles/output.rtf";

            File f=new File(path2);
            System.out.println(f.canRead());
            System.out.println(f.canWrite());
            System.out.println(f.canExecute());
            System.out.println(f.getAbsolutePath());
            System.out.println(f.getAbsoluteFile());
            System.out.println(f.getParent());
            System.out.println(f.getName());
            System.err.println("Error message");


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
