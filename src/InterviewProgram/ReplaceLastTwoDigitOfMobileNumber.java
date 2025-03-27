package InterviewProgram;

public class ReplaceLastTwoDigitOfMobileNumber {
    public static void main(String[] args) {
        String mobileNumer = "9876846309";
//        String s = mobileNumer.replaceAll("(\\d{8})(\\d{2})", "########$2");
        StringBuffer stringBuffer=new StringBuffer(mobileNumer);
        for (int i=0; i<mobileNumer.length()-2;i++){
            if(mobileNumer.length()==10)
            {
                stringBuffer.setCharAt(i,'#');
            }
        }
        System.out.println(stringBuffer);



    }
}
