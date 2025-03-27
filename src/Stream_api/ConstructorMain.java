package Stream_api;

public class ConstructorMain {
    public static void main(String[] args) {

        //Constructor refference
        Provider provider=Student::new;

        Student student = provider.getStudent();
        student.display();
    }
}
