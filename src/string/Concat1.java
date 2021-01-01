package string;

public class Concat1 {
    public static void main(String[] args) {
        String s1 ="kamran khan ";
        String s2="Mohd Atif";
        s1.concat("mutable");
        s2.concat("shadab alam");
        System.out.println(s1);
        System.out.println(s2);
        s1=s1.concat("welocome to hyd");
        s2=s2.concat("is immutable so against explicity");
        System.out.println(s1);
        System.out.println(s2);


    }
}
