package FileIOStream.Serialization;

import java.io.*;

public class StudentApp {
    public static void main(String[] args) {
        try {


           // Student s = new Student("Kunal", 26, "HYD", "Male", 88);
           // s.display();
            String path = "/Users/ghanshyammandal/Documents/IOFiles/student.rtf";
            FileInputStream fos = new FileInputStream(path);
            ObjectInputStream oos=new ObjectInputStream(fos);
            Student stu= (Student) oos.readObject();
            stu.display();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
