package string;

public class Equalsexp2 {
    public static void main(String[] args) {
        String s1="hyderabad";
        String s2="hyderabad";
        String s3="HYDERABAD";
        System.out.println(s1.equals(s2));
        if(s1.equals(s2)){
            System.out.println("KAMRAN");
        }else
            System.out.println("both string is unequal");

    }
}
