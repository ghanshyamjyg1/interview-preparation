package OOPS;

public class Student {
     String studentName;
     int studentId;
     String studentCity;

     Student(){
         this(1,"Geeta","Banglore");
         System.out.println("Default constructor");

     }

     // Constructor overloading...
     Student(int i,String studentName , String studentCity)
     {
         System.out.println("Parameterized constructor ");
         this.studentName=studentName;
         this.studentCity=studentCity;
     }
     public void study(){
         System.out.println(studentName + " Is studying");
     }
     // Method overloading...
     public double study(float f){
         return  f;
     }
     public void showAllDetails(){
         System.out.println(studentId);
         System.out.println(studentName);
         System.out.println(studentCity);
     }
}
