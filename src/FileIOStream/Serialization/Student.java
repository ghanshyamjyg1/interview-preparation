package FileIOStream.Serialization;

import java.io.*;

public class Student implements Externalizable {
    String name;
    int age;
    String city;
    String gender;
    int mark;

    public Student(String name, int age, String city, String gender, int mark) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.gender = gender;
        this.mark = mark;
    }


    public void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(city);
        System.out.println(gender);
        System.out.println(mark);

    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(age);
        out.writeInt(mark);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        age=in.readInt();
        mark=in.readInt();
    }
}
