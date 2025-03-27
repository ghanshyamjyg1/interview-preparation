package Collections;



public class Student {
    String name;
    int age;
    String city;
//    @Override
//    public int compareTo(Student o) {
//        return this.age-o.age;
//    }
    public Student(String name,int age,String city)
    {
        this.name=name;
        this.age=age;
        this.city=city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }




//    @Override
//    public int compareTo(Object o)
//    {
//        if(this.age>((Student)(o)).age)
//        {
//            return 1;
//        }
//        else {
//            return -1;
//        }
//    }


}
