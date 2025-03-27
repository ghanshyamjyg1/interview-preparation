package Exception;

public class NullPointerExample {
    public static void main(String[] args) {
        String str=null;

        try {
            System.out.println(str.length());
        }
        catch (NullPointerException n)
        {
//            n.printStackTrace();
            System.out.println("Null pointer exception occured");
        }
    }
}
