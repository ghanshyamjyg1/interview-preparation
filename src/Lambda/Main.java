package Lambda;

public class Main {
    public static void main(java.lang.String[] args) {
        System.out.println("System starts...");
        /*Anonymous class*/
//        MyInterImpl m=new MyInterImpl();
//        m.sayHello();
//       MyInter i= new MyInter() {
//            @Override
//            public void sayHello() {
//                System.out.println("My first anonymous interface class");
//            }
//        };
//       i.sayHello();
//       MyInter i2=new MyInter() {
//           @Override
//           public void sayHello() {
//               System.out.println("My second anonymous interface class");
//           }
//       };
//       i2.sayHello();
        /*Using our interface with the help of lambda expression*/
        MyInter m1=()->System.out.println("This is our first lambda expression");
        m1.sayHello();
        MyInter.lol();

        SumInter sumInter=(a, b)-> a+b;
        System.out.println(sumInter.SumNumber(2,4));
        System.out.println(sumInter.SumNumber(22,33));

        LenString lenString=str-> str.length();

        System.out.println("Length of string "+lenString.lengthOfString("Kunal"));

    }
}
