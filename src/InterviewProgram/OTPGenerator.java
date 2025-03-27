package InterviewProgram;

import java.util.Random;

public class OTPGenerator {
    public static void main(String[] args) {
//        int random = (int) (Math.random()*9000)+1000;
//        String otp = String.valueOf(random);
        Random random =new Random();
        int otp =1000+random.nextInt(9000);
        System.out.println("OTP : "+otp);
    }
}
