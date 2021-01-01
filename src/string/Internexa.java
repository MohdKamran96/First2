package string;

public class Internexa {
    public static void main(String args[]){
        String s1="javatpoint";
        String s2=s1.intern();
        String s3 =new String("javatpoint");
        String s4= s3.intern();
        System.out.println(s1==s2);//true
        System.out.println(s1==s3);//false
        System.out.println(s1==s4);//true
        System.out.println(s2==s3);//false
        System.out.println(s2==s4);//true
        System.out.println(s3==s4);//false

    }
}
