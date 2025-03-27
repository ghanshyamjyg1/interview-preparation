package OOPS;

public class Demo {
    public static void main(String[] args) {

        Student st1=new Student();
        st1.studentName="Ram";
        st1.studentId=123;
        st1.studentCity="Hyd";
//        st1.study();
//        st1.showAllDetails();
        Student st2=new Student(1,"New One","gh");
        st1.studentName="Mahesh";
        st1.studentId=321;
        st1.studentCity="Slg";
        st1.study();
        st1.showAllDetails();
    }
}
